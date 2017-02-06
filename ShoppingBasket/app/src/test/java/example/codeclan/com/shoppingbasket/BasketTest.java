package example.codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 05/02/2017.
 */
public class BasketTest {
    Basket basket1;
    Item item1;
    Item item2;

    @Before
    public void before(){
        basket1 = new Basket ();
        item1 = new Item ("Bread", 1.00, true);
        item2 = new Item ("Milk", 2.00, false);
    }

    @Test
    public void countEmptyBasket(){
        assertEquals(0, basket1.countItemsInBasket());
    }

    @Test
    public void canAddItemToBasket(){
        basket1.addToBasket(item1);
        assertEquals(1, basket1.countItemsInBasket());
    }

    @Test
    public void canAddMultipleItemToBasket(){
        basket1.addToBasket(item1);
        basket1.addToBasket(item2);
        assertEquals(2, basket1.countItemsInBasket());
    }

    @Test
    public void canRemoveFromBasket(){
        basket1.addToBasket(item1);
        basket1.addToBasket(item2);
        basket1.removeFromBasket(item2);
        assertEquals(1, basket1.countItemsInBasket());
    }

    @Test
    public void canEmptyBasket(){
        basket1.addToBasket(item1);
        basket1.addToBasket(item2);
        basket1.emptyBasket();
        assertEquals(0, basket1.countItemsInBasket());
    }

    @Test
    public void canHaveMultipleOfSameItem(){
        basket1.addToBasket(item1);
        basket1.addToBasket(item2);
        basket1.addToBasket(item1);
        assertEquals(0, basket1.countItemsInBasket());
    }

    @Test
    public void canPriceBasket(){
        basket1.addToBasket(item1);
        basket1.addToBasket(item2);
        assertEquals(3.00, basket1.priceItemsInBasket(), 0.00);
    }


}