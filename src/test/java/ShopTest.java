import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Drums drums;
    Item item;


    @Before
    public void setUp() {
        shop = new Shop();
        guitar = new Guitar("Wood", "Sky Blue", "Acoustic", 120.00, 180.00, 6);
        drums = new Drums("Plastic", "Pearl White", "Full Kit", 200.00, 230.00, 5);
        item = new Item("Plectrums", 2.99, 4.99);
    }

    @Test
    public void hasEmptyArray() {
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddToStockSelection() {
        shop.addToStockSelection(guitar);
        shop.addToStockSelection(drums);
        shop.addToStockSelection(item);
        assertEquals(3, shop.getStockCount());
    }

    @Test
    public void canRemoveFromStockSelection() {
        shop.addToStockSelection(guitar);
        shop.addToStockSelection(drums);
        shop.addToStockSelection(item);
        shop.removeFromStockSelection(guitar);
        assertEquals(2, shop.getStockCount());
    }
}
