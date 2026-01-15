import java.util.Map;

public class CurrentPriceDisplay implements Observer, Display {

    private Map<String, StockPrice> stockPrices;
    private StockMarket stockMarket;

    public CurrentPriceDisplay(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
        stockMarket.addObserver(this);
    }

    @Override
    public void update() {
        stockPrices = stockMarket.getStockPrices();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Prices Display");
        System.out.println("----------------------");

        for (Map.Entry<String, StockPrice> mapElement : stockPrices.entrySet()) {
            String symbol = mapElement.getKey();
            StockPrice stockPrice = mapElement.getValue();

            System.out.println("Current Price of : " + symbol + " = " + stockPrice.getPrice());
        }
    }
}
