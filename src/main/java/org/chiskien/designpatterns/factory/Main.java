package org.chiskien.designpatterns.factory;

public class Main {


    public static void main(String[] args) {
//        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
//        pizzaStore.orderPizza("pepperoni");
//        pizzaStore.orderPizza("cheese");
//        pizzaStore.orderPizza("clam");
//        NewYorkPizzaFactory newYorkPizzaFactory = new NewYorkPizzaFactory();
//        ChicagoPizzaFactory chicagoPizzaFactory = new ChicagoPizzaFactory();

        PizzaStore vietnameseStylePizzaStore = new VietnameseStylePizzaStore();
        PizzaStore newYorkPizzaStore = new NewYorkStylePizzaStore();
        Pizza p = vietnameseStylePizzaStore.orderPizza("korean");
        Pizza p2 = newYorkPizzaStore.orderPizza("cheese");
        System.out.println(p + " " + p2);
    }
}
