public class Guitar extends Instrument implements IPlay, ISell {

    private double buyPrice;
    private double sellPrice;
    private int numberOfStrings;

    public Guitar(String material, String colour, String type, double buyPrice, double sellPrice, int numberOfStrings) {
        super(material, colour, type);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.numberOfStrings = numberOfStrings;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "Wah wah wah";
    }

    public void setSellPrice(double newSellPrice) {
        this.sellPrice = newSellPrice;
    }

    public double calculateMarkup() {
        double markup = sellPrice - buyPrice;
        return markup;
    }
}
