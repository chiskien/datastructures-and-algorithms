package chiskien.designpatterns.decorator.starbuzzcoffee;

import chiskien.designpatterns.decorator.starbuzzcoffee.beverages.Beverage;
import chiskien.designpatterns.decorator.starbuzzcoffee.beverages.Espresso;
import chiskien.designpatterns.decorator.starbuzzcoffee.beverages.HouseBlend;
import chiskien.designpatterns.decorator.starbuzzcoffee.condiments.ChocolateCookie;
import chiskien.designpatterns.decorator.starbuzzcoffee.condiments.Mocha;

public class StarbuzzCoffee {

    public static void main(String[] args) {


        Beverage rawEspresso = new Espresso();
        System.out.println(rawEspresso.getDescription() + " $" + rawEspresso.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new ChocolateCookie(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());

    }
}
