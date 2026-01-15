public class StockPrice {
    private double price;
    private double change;
    private int volume;

    StockPrice(double price, int volume) {
        this.price = price;
        this.volume = volume;
        this.change = 0;
    }

    // getter and setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    // getter and setter for change
    public void setChange(double change) {
        this.change = change;
    }

    public double getChange() {
        return change;
    }

    // getter and setter for volume
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
