import java.time.LocalDate;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        //# Creating an ArrayList and adding new elements to it
        System.out.println("========= # Creating an ArrayList and adding new elements to it");

        ArrayList<Anime> anime = new ArrayList<>();

        // Adding new elements to the ArrayList
        Anime naruto = new Anime();
        naruto.setTitle("Naruro");
        AnimeType Naruto = new AnimeType("Adventure");
        naruto.setAnimeType(Naruto);
        LocalDate releaseDateNaruto = LocalDate.of(2002,10,3);
        naruto.setDate(releaseDateNaruto);
        naruto.setSeasons(3);
        naruto.setNumber(1100);
        naruto.addSpecialSign("Easy_to_watch");
        naruto.addSpecialSign("Lots_of_Series");
        naruto.addSpecialSign("Fantasy_World");
        System.out.println(naruto);
        System.out.println("----------------");

        Anime fairy_tail = new Anime();
        fairy_tail.setTitle("Fairy_Tail");
        AnimeType Fairy_Tail = new AnimeType("Fantasy");
        fairy_tail.setAnimeType(Fairy_Tail);
        LocalDate releaseDateFairy = LocalDate.of(2009,10,12);
        fairy_tail.setDate(releaseDateFairy);
        fairy_tail.setSeasons(4);
        fairy_tail.setNumber(227);
        fairy_tail.addSpecialSign("Easy_to_watch");
        fairy_tail.addSpecialSign("Short_Series");
        fairy_tail.addSpecialSign("Fantasy_World");
        System.out.println(fairy_tail);
        System.out.println("----------------");
        
        Anime one_piece = new Anime();
        one_piece.setTitle("One_Piece");
        AnimeType One_Piece = new AnimeType("Comedy");
        one_piece.setAnimeType(One_Piece);
        LocalDate releaseDateOne = LocalDate.of(1999,10,20);
        one_piece.setDate(releaseDateOne);
        one_piece.setSeasons(1);
        one_piece.setNumber(860);
        one_piece.addSpecialSign("Easy_to_watch");
        one_piece.addSpecialSign("Good_for_Kids");
        one_piece.addSpecialSign("Fantasy_World");
        System.out.println(one_piece);

        anime.add(naruto);
        anime.add(fairy_tail);
        anime.add(one_piece);

        //#Accessing elements from an ArrayList
        System.out.println("========= #Accessing elements from an ArrayList");
        System.out.println("First anime: " + anime.get(0));
        System.out.println("Second anime: " + anime.get(1));
        System.out.println("Last anime: " + anime.get(anime.size()-1));

        //#Removing elements from an ArrayList
        System.out.println("========= #Removing elements from an ArrayList");
        anime.remove(2);
        System.out.println("Animes size: " + anime.size());

        //#Iterating over an ArrayList
        System.out.println("========= #Iterating over an ArrayList");
        for(int i = 0; i < anime.size(); i++) {
            System.out.println(anime.get(i));
        }

        for(int i = 0; i < anime.size(); i++) {
            System.out.println(anime.get(i));
        }

    }
}
