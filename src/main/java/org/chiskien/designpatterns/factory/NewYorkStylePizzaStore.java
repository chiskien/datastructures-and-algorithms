package org.chiskien.designpatterns.factory;

public class NewYorkStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NewYorkStyleCheesePizza();
            case "clam" -> new NewYorkStyleClamPizza();
            case "pepperoni" -> new NewYorkStylePepperoniPizza();
            default -> null;
        };
    }
}
