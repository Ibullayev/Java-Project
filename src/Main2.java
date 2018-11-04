import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Double;

public class Main2 {

    public static void main(String args[]){

        ArrayList<Anime> animes = new ArrayList<>();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try{
            Scanner input = new Scanner(new File("./src/1.txt"));

            while(input.hasNextLine()){
                String line;
                Anime anime = new Anime();

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
                        int seasons = data.nextInt();
                        anime.setSeasons(seasons);
                    }

                    if(data.hasNext()){
                        double number_of_series = Double.parseDouble(data.next());
                        anime.setNumber(number_of_series);
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
            File file = new File("./src/2.txt");
            PrintWriter pw = new PrintWriter(new FileOutputStream(file, true));

            for(int i = 0; i < animes.size(); i++) {
                pw.append("\n" + animes.get(i).getTitle());
            }

            pw.close();

        }catch(Exception e){

        }

    }
}