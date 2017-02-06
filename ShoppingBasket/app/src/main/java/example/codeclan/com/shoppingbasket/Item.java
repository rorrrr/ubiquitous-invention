package example.codeclan.com.shoppingbasket;

/**
 * Created by user on 05/02/2017.
 */

public class Item {
    private String name;
    private double price;
    private boolean bOGOF;

    public Item(String name, double price, boolean bOGOF){
        this.name = name;
        this.price = price;
        this.bOGOF = bOGOF;
    }

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean getBOGOF() {
        return bOGOF;
    }
}
