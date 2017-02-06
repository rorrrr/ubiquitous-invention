package example.codeclan.com.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 05/02/2017.
 */
public class ItemTest {
    Item item1;

    @Before
    public void before(){
        item1 = new Item ("Bread", 1.00, true);
    }

    @Test
    public void canGetName(){
        assertEquals("Bread", item1.getName());
    }

    @Test
    public void canGetPrice(){
        assertEquals(1.00, item1.getPrice(), 0.01);
    }

    @Test
    public void canGetBogof(){
        assertEquals(true, item1.getBOGOF());
    }


}