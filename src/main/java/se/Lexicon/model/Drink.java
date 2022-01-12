package se.Lexicon.model;

public class Drink extends Product{
    private String brand;
    private boolean noSugar;

    public Drink(String brand, boolean noSugar, int id, double price, String productName) {
        super(id, price, productName);
        this.brand = brand;
        this.noSugar = noSugar;
    }

    @Override
    public String examine() {
        String sugar="";
        if (noSugar)
            sugar ="no sugar";
        else sugar="sugar";

        return "Drink: "+brand + " is a drink with " + sugar;
    }

    @Override
    public String use() {
        return "Open and drink";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isNoSugar() {
        return noSugar;
    }

    public void setNoSugar(boolean noSugar) {
        this.noSugar = noSugar;
    }
}
