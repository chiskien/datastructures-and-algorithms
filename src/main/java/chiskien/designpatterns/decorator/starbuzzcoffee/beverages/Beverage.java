package chiskien.designpatterns.decorator.starbuzzcoffee.beverages;

//component
public abstract class Beverage {
    String description = "Unknown Description";

    public abstract double cost();

    public String getDescription() {
        return description;
    }


}
