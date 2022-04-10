public class Item implements ISell {

    private String name;
    private double buyPrice;
    private double sellPrice;

    public Item(String name, double buyPrice, double sellPrice) {
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double newSellPrice) {
        this.sellPrice = newSellPrice;
    }

    public double calculateMarkup() {
        double markup = sellPrice - buyPrice;
        return markup;
    }
}
