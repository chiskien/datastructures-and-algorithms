package org.chiskien.designpatterns.factory;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CheesePizza();
            case "clam" -> new ClamPizza();
            default -> null;
        };
    }
}
