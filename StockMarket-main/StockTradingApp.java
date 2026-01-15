public class StockTradingApp {

    public static void main(String[] args) {

        // Subject
        StockMarket CSE = new StockMarket();

        // Observers
        Observer currentPriceDisplay = new CurrentPriceDisplay(CSE);
        Observer alertDisplay = new AlertDisplay(CSE);

        CSE.newStock("AAPL", 175.50, 100);
        CSE.newStock("GOGL", 200.25, 500);

        CSE.updateStockPrice("AAPL", 180);
        System.out.println();
        CSE.updateStockPrice("GOGL", 230.50);
    }
}
