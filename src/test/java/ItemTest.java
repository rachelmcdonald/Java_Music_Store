import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void setUp() {
        item = new Item("Drum Sticks", 5.00, 10.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Drum Sticks", item.getName());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(5.00, item.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(10.00, item.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice() {
        item.setSellPrice(8.00);
        assertEquals(8.00, item.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(5.00, item.calculateMarkup(), 0.01);
    }
}
