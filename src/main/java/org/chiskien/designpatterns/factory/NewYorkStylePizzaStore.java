package org.chiskien.designpatterns.factory;

public class NewYorkStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CheesePizza();
            case "clam" -> new ClamPizza();
            default -> null;
        };
    }
}
