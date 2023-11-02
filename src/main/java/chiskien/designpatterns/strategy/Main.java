package chiskien.designpatterns.strategy;

import chiskien.designpatterns.strategy.ducks.Duck;
import chiskien.designpatterns.strategy.ducks.MallardDuck;
import chiskien.designpatterns.strategy.ducks.RedHeadDuck;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redhead = new RedHeadDuck();

        mallard.performQuack();
        mallard.display();
        redhead.performFly();
    }
}

