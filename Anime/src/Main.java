import java.time.LocalDate;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        //# Creating an ArrayList and adding new elements to it
        System.out.println("========= # Creating an ArrayList and adding new elements to it");

        ArrayList<Anime> anime = new ArrayList<>();

        // Adding new elements to the ArrayList
        Anime t_shirt = new Anime();
        t_shirt.setTitle("T-shirt");
        StaffType Naruto = new StaffType("Naruto");
        t_shirt.setStaffType(Naruto);
        LocalDate incomeDateT_shirt = LocalDate.of(2018,10,29);
        t_shirt.setDate(incomeDateT_shirt);
        t_shirt.setQuantity(20);
        t_shirt.setHeight(110);
        t_shirt.setWeight(300);
        t_shirt.addSpecialSign("Black");
        t_shirt.addSpecialSign("Good print");
        t_shirt.addSpecialSign("Easy to wash");
        System.out.println(t_shirt);

        Anime toy = new Anime();
        toy.setTitle("Soft toy");
        StaffType soft_toy = new StaffType("Kotori Tai Fluffy Birds");
        toy.setStaffType(soft_toy);
        LocalDate incomeDateToy = LocalDate.of(2018,9,4);
        toy.setDate(incomeDateToy);
        toy.setQuantity(50);
        t_shirt.setHeight(90);
        t_shirt.setWeight(500);
        toy.addSpecialSign("Yellow");
        toy.addSpecialSign("With Hawaiian Flower");
        toy.addSpecialSign("Good for kids");
        System.out.println(toy);

        Anime key_chain = new Anime();
        key_chain.setTitle("Key chain");
        StaffType key_Chain = new StaffType("Itachi Key Chain");
        key_chain.setStaffType(key_Chain);
        LocalDate incomeDateKey = LocalDate.of(2018,6,10);
        key_chain.setDate(incomeDateKey);
        key_chain.setQuantity(100);
        t_shirt.setHeight(20);
        t_shirt.setWeight(100);
        key_chain.addSpecialSign("Good Picture");
        key_chain.addSpecialSign("Steel");
        key_chain.addSpecialSign("Easy use");
        System.out.println(key_chain);

        anime.add(t_shirt);
        anime.add(toy);
        anime.add(key_chain);

        //#Accessing elements from an ArrayList
        System.out.println("========= #Accessing elements from an ArrayList");
        System.out.println("First pet: " + anime.get(0));
        System.out.println("Second pet: " + anime.get(1));
        System.out.println("Last pet: " + anime.get(anime.size()-1));

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
