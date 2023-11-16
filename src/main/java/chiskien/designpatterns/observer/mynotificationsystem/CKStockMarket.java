package chiskien.designpatterns.observer.mynotificationsystem;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CKStockMarket implements Subject {

    private final Map<Integer, Observer> observers;
    private double stockPrice;

    public CKStockMarket() {
        this.observers = new HashMap<>();
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double newPrice) {
        this.stockPrice = newPrice;
        priceChanged();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.put(observers.size() + 1, observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers.values()) {
            observer.update();
        }
    }

    @Override
    public void removeObserver(Integer id) {
        observers.remove(id);
    }

    private void priceChanged() {
        notifyObservers();
    }

    @Override
    public void registerObservers(Collection<Observer> observers) {

    }
}
