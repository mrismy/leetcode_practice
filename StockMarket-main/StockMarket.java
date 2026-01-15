import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StockMarket implements Subject {

    private Map<String, StockPrice> stockPrices;
    private ArrayList<Observer> observers;

    StockMarket() {
        observers = new ArrayList<>();
        stockPrices = new HashMap<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void newStock(String symbol, double price, int volume) {
        StockPrice stockPrice = new StockPrice(price, volume);
        stockPrices.put(symbol, stockPrice);
    }

    public void updateStockPrice(String symbol, double newPrice) {
        StockPrice stockPrice = stockPrices.get(symbol);

        if (stockPrice != null) {
            double change = newPrice - stockPrice.getPrice();

            stockPrice.setPrice(newPrice);
            stockPrice.setChange(change);
        }

        notifyObserver();
    }

    public Map<String, StockPrice> getStockPrices(){
        return stockPrices;
    }

}
