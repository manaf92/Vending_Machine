package se.Lexicon.model;

public class Snack extends Product{
    private String taste;

    public Snack(String taste,int id, double price, String productName) {
        super(id, price, productName);
        this.taste = taste;
    }

    @Override
    public String examine() {
        return "Snack taste: " + taste;
    }

    @Override
    public String use() {
        return "Open it, smell it and eat it ";
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
