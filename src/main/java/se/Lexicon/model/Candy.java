package se.Lexicon.model;

public class Candy extends Product{
    private String color;
    private boolean noLicorice;

    public Candy(int id, double price, String productName) {
        super(id, price, productName);
    }


    @Override
    public String examine() {
        String licorice="";
        if (noLicorice)
            licorice ="No";
        else licorice="Yes";

        return "Candy product color: "+color + ", Licorice " + licorice;
    }

    @Override
    public String use() {
        return "Open it and don't eat too much";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNoLicorice() {
        return noLicorice;
    }

    public void setNoLicorice(boolean noLicorice) {
        this.noLicorice = noLicorice;
    }
}
