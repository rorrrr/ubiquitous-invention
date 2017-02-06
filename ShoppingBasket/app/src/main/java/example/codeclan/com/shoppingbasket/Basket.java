package example.codeclan.com.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 05/02/2017.
 */

public class Basket {
    private ArrayList<Item> items;


    public Basket(){
        this.items = new ArrayList<Item>();
    }

    public int countItemsInBasket(){
       return items.size();
    }

    public void addToBasket(Item item){
        items.add(item);
    }


    public void removeFromBasket(Item item1) {
        for (Item item : items){
            items.remove(item1);
        }
    }


    public void emptyBasket() {
        items.clear();
    }

    public int priceItemsInBasket() {
        int counter = 0;
        for (Item item : items){
            counter += item.getPrice();
        }

        return counter;

    }
}
