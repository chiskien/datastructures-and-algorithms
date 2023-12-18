package chiskien.designpatterns.factory.pizzahub;

public class PizzaFactory {

    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            default -> throw new IllegalArgumentException("Not found any pizza suit your fucking taste, bietch!");
        };
    }
}
