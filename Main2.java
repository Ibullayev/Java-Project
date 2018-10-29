import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Double;

public class Main2 {

    public static void main(String args[]){

    ArrayList<Main2> animes = new ArrayList<>();

    DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try{
            Scanner input = new Scanner(new File("petsdatabase.db"));

            while(input.hasNextLine()){
                String line;
                Main2 anime = new Main2();
                
                line = input.nextLine();

                try{
                    Scanner data = new Scanner(line);
                    if(data.hasNext()){
                        String name = data.next().trim();
                        anime.setTitle(name);
                    }

                    if(data.hasNext()){
                        AnimeType animeType = new AnimeType();
                        animeType.setTypeName(data.next().trim());
                        anime.setAnimeType(animeType);
                    }

                    if(data.hasNext()){
                        LocalDate releaseDate = LocalDate.parse(data.next(), f);
                        anime.setDate(releaseDate);
                    }

                    if(data.hasNextInt()){
                        int age = data.nextInt();
                        anime.setNumber(age);
                    }

                    if(data.hasNext()){
                        String nickname = data.next().trim();
                        anime.setNickname(nickname);
                    }

                    if(data.hasNext()){
                        double weight = Double.parseDouble(data.next());
                        anime.setWeight(weight);
                    }

                    if(data.hasNext()){
                        String signs = data.next();
                        for(int i = 0; i < signs.split(",").length; i++){
                            anime.addSpecialSign(signs.split(",")[i]);
                        }
                    }

                }catch(Exception e){
                    System.out.println(e);
                }

                animes.add(anime);

            }

        }catch(IOException e){
            System.out.println(e);
        }

        for(int i = 0; i < animes.size(); i++) {
            System.out.println("#================================");
            System.out.println(animes.get(i));
        }

        try{
            File file = new File("outputpets.db");
            PrintWriter pw = new PrintWriter(new FileOutputStream(file, true));

            for(int i = 0; i < animes.size(); i++) {
                pw.append("\n" + animes.get(i).getName());
            }

            pw.close();

        }catch(Exception e){

        }

    }
}