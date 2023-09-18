package org.chiskien.designpatterns.factory;

public class NewYorkStyleCheesePizza extends Pizza {

    public NewYorkStyleCheesePizza() {
        name = "New York style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Mariana Sauce";
        toppings.add(new Topping("Grated Reggiano Cheese"));
    }
}
