package chiskien.designpatterns.observer.mynotificationsystem;

public class Main {
    public static void main(String[] args) {
        //TODO: build time series table
        CKStockMarket ckStockMarket = new CKStockMarket();
        StupidDumpStockBitcoinTrader stupidDumpStockBitcoinTrader = new StupidDumpStockBitcoinTrader(ckStockMarket);
        ckStockMarket.setStockPrice(20);
        ckStockMarket.setStockPrice(21414);
        ckStockMarket.setStockPrice(-10);

    }
}
