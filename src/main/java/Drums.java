public class Drums extends Instrument implements IPlay, ISell {

    private double buyPrice;
    private double sellPrice;
    private int numberOfCymbals;

    public Drums(String material, String colour, String type, double buyPrice, double sellPrice, int numberOfCymbals) {
        super(material, colour, type);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.numberOfCymbals = numberOfCymbals;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public int getNumberOfCymbals() {
        return numberOfCymbals;
    }

    public String play() {
        return "Bum bah rum bum";
    }

    public void setSellPrice(double newSellPrice) {
        this.sellPrice = newSellPrice;
    }

    public double calculateMarkup() {
        double markup = sellPrice - buyPrice;
        return markup;
    }
}
