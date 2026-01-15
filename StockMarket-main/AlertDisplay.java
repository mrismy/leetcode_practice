import java.util.Map;

public class AlertDisplay implements Observer, Display {
    private Map<String, StockPrice> stockPrices;
    private StockMarket stockMarket;

    AlertDisplay(StockMarket stockMarket) {
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
        System.out.println("Alert Display");
        System.out.println("----------------------");

        for (Map.Entry<String, StockPrice> e : stockPrices.entrySet()) {
            String symbol = e.getKey();
            StockPrice stockPrice = e.getValue();

            if (stockPrice.getChange() > 20) {
                System.out.println(symbol + " changed by " + stockPrice.getChange());
            }
        }
    }

}
