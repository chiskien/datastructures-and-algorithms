package chiskien.designpatterns.decorator.starbuzzcoffee.beverages;

//concrete component
public class Espresso extends Beverage {
    private double mochaCost = 30;

    public Espresso() {
        description = "Espresso";
    }

    private double getEspressoCost() {
        return mochaCost;
    }

    public void setEspressoCost(double mochaCost) {
        this.mochaCost = mochaCost;
    }

    @Override
    public double cost() {
        return getEspressoCost();
    }

}
