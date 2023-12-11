package chiskien.designpatterns.factory.pizzahub;

public class PizzaFactory {

    public Pizza orderPizza(String type) {
        Pizza pizza = switch (type) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            default -> throw new IllegalArgumentException("Not found any pizza suit your fucking taste, bietch!");
        };
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
