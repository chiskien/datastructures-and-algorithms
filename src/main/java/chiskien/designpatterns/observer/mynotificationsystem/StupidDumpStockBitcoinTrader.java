package chiskien.designpatterns.observer.mynotificationsystem;

public class StupidDumpStockBitcoinTrader implements Observer {
    private final CKStockMarket stockMarket;
    private double lastPrice;
    private double currentPrice;

    public StupidDumpStockBitcoinTrader(CKStockMarket stockMarket) {
        this.stockMarket = stockMarket;
        stockMarket.registerObserver(this);
    }

    @Override
    public void update() {
        lastPrice = currentPrice;
        currentPrice = stockMarket.getStockPrice();
        display();
    }

    private void display() {
        System.out.println("Last price:" + lastPrice + "| Current price:" + currentPrice);
        double diff = Math.abs(currentPrice - lastPrice);
        switch (Double.compare(currentPrice, lastPrice)) {
            case 0:
                System.out.println("Remain the same");
                break;
            case 1:
                System.out.println("Stock went stonk: " + diff);
                break;
            case -1:
                System.out.println("Stock went down: " + diff);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + Double.compare(lastPrice, currentPrice));
        }
    }
}
