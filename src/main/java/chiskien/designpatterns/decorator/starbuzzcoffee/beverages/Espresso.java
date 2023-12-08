package chiskien.designpatterns.decorator.starbuzzcoffee.beverages;

//concrete component
public class Espresso extends Beverage {
    private double espresso = 30;

    public Espresso() {
        description = "Espresso";
    }

    private double getEspressoCost() {
        return espresso;
    }

    public void setEspressoCost(double espresso) {
        this.espresso = espresso;
    }

    @Override
    public double cost() {
        return getEspressoCost();
    }

}
