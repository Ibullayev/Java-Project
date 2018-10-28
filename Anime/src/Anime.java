import java.time.LocalDate;
import java.util.ArrayList;

public class Anime {

    private String title;
    private StaffType staff;
    private LocalDate incomeDate;
    private int quantity;
    private double weight;
    private double height;
    private ArrayList<String> specialSigns = new ArrayList<>();

    public Anime(StaffType staff, LocalDate incomeDate, int quantity, double weight, double height) {
        this.staff = staff;
        this.incomeDate = incomeDate;
        this.quantity = quantity;
        this.weight = weight;
        this.height = height;
    }

    public Anime(){

    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public StaffType getStaffType() {
        return staff;
    }

    public void setStaffType(StaffType staff) {
        this.staff = staff;
    }

    public LocalDate getDate() {
        return incomeDate;
    }

    public void setDate(LocalDate incomeDate) {
        this.incomeDate = incomeDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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
                +"\nStaff type:" + this.staff.getTypeName()
                +"\nIncome Date:" + this.incomeDate
                +"\nQuantity:" + this.quantity
                +"\nWeight:" + this.weight
                +"\nheight:" + this.height
                +"\nSpecial signs:" + sSigns;
    }






}