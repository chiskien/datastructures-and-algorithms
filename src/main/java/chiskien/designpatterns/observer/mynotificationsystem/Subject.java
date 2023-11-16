package chiskien.designpatterns.observer.mynotificationsystem;

import java.util.Collection;

public interface Subject {

    void registerObserver(Observer observer);

    void notifyObservers();

    void removeObserver(Integer id);

    void registerObservers(Collection<Observer> observers);
}
