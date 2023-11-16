package chiskien.designpatterns.observer.weatherforecastingsystem;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
