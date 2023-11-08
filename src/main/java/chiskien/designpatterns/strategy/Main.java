package chiskien.designpatterns.strategy;

import chiskien.designpatterns.strategy.mygame.AutoAttack;
import chiskien.designpatterns.strategy.mygame.Champion;
import chiskien.designpatterns.strategy.mygame.Sylas;

public class Main {

    public static void main(String[] args) {
//        Duck mallard = new MallardDuck();
//        Duck redhead = new RedHeadDuck();
//
//        mallard.performQuack();
//        mallard.display();
//        redhead.performFly();

        Champion champion = new Sylas();
        champion.display();
        champion.setAttackBehavior(new AutoAttack());
        champion.performMoving();
        champion.performAttack();
        champion.performDefense();
    }
}

