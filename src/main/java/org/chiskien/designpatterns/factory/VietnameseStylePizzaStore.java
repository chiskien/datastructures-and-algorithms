package org.chiskien.designpatterns.factory;

public class VietnameseStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "seafood" -> new SeaFoodVietNamPizza();
            case "korean" -> new KoreanPizza();
            default -> null;
        };
    }

}
