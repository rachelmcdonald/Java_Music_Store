import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Birch Wood", "Neon Yellow", "Electric", 150.00, 200.00, 6);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Birch Wood", guitar.getMaterial());
    }

    @Test
    public void canGetType() {
        assertEquals("Electric", guitar.getType());
    }

    @Test
    public void canGetColour() {
        assertEquals("Neon Yellow", guitar.getColour());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canGetBuyPrice() {
        assertEquals(150.00, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice() {
        assertEquals(200.00, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canSetBuyPrice() {
        guitar.setSellPrice(125.00);
        assertEquals(125.00, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Wah wah wah", guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(50.00, guitar.calculateMarkup(), 0.01);
    }
}
