package anime;

import java.time.LocalDate;
import java.util.ArrayList;

public class Anime {

    private String title;
    private AnimeType type;
    private LocalDate releaseDate;
    private int seasons;
    private double number_of_series;
    private ArrayList<String> specialSigns = new ArrayList<>();

    public Anime(AnimeType type, LocalDate releaseDate, int seasons, double number_of_series) {
        this.type = type;
        this.releaseDate = releaseDate;
        this.seasons = seasons;
        this.number_of_series = number_of_series;
    }

    public Anime(){

    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public AnimeType getAnimeType() {
        return type;
    }

    public void setAnimeType(AnimeType type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return releaseDate;
    }

    public void setDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int quantity) {
        this.seasons = quantity;
    }

    public double getNumber() {
        return number_of_series;
    }

    public void setNumber(double number_of_series) {
        this.number_of_series = number_of_series;
    }

    public ArrayList<String> getSpecialSigns() {
        return specialSigns;
    }

    public void addSpecialSign(String specialSign) {

        this.specialSigns.add(specialSign);
    }

    public String toString(){
        String sSigns = "";
        for(String sign : this.specialSigns){
            sSigns = sSigns + sign + ",";
        }

        return "Title:" + this.title
                +"\nType :" + this.type.getTypeName()
                +"\nRelease Date:" + this.releaseDate
                +"\nSeasons:" + this.seasons
                +"\nNumber of Series:" + this.number_of_series
                +"\nSpecial signs:" + sSigns;
    }






}