package chiskien.designpatterns.decorator.starbuzzcoffee.beverages;

public class HouseBlend extends Beverage {

    private double baseHouseBlendCost = 25;

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return getBaseHouseBlendCost();
    }

    public double getBaseHouseBlendCost() {
        return baseHouseBlendCost;
    }

    public void setBaseHouseBlendCost(double baseHouseBlendCost) {
        this.baseHouseBlendCost = baseHouseBlendCost;
    }
}
