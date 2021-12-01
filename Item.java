import java.util.ArrayList;

public class Item {
    private String name;
    private double price;
    public ArrayList<String> items = new ArrayList<String>();

    public Item() {
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getItemName() {
        return this.name;
    }

    public void setItemName(String name) {
        this.name = name;
    }

    public double getItemPrice() {
        return this.price;
    }

    public void setItemPrice(double price) {
        this.price = price;
    }

}
