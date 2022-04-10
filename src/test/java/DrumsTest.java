import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void setUp() {
        drums = new Drums("Maple Wood", "Cherry Red", "Bass Drum", 200.00, 250.00, 4);
    }

    @Test
    public void canGetNumberOfCymbals() {
        assertEquals(4, drums.getNumberOfCymbals());
    }

    @Test
    public void canPlay() {
        assertEquals("Bum bah rum bum", drums.play());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(200.00, drums.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(250.00, drums.getSellPrice(), 0.01);
    }

    @Test
    public void canSetSellPrice() {
        drums.setSellPrice(280.00);
        assertEquals(280.00, drums.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(50.00, drums.calculateMarkup(), 0.01);
    }
}
