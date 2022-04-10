import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void addToStockSelection(ISell product) {
        this.stock.add(product);
    }

    public void removeFromStockSelection(ISell product) {
        this.stock.remove(product);
    }
}
