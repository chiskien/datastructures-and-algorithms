package chiskien.designpatterns.decorator.mymythicalshop;

import chiskien.designpatterns.decorator.mymythicalshop.champions.Champion;
import chiskien.designpatterns.decorator.mymythicalshop.champions.Sylas;
import chiskien.designpatterns.decorator.mymythicalshop.items.BFSword;
import chiskien.designpatterns.decorator.mymythicalshop.items.Boots;
import chiskien.designpatterns.decorator.mymythicalshop.items.Everfrost;


public class MythicalShop {
    public static void main(String[] args) {
        Champion sylas = new Sylas();
        sylas = new BFSword(sylas);
        sylas = new Everfrost(sylas);
        sylas = new Boots(sylas);
        System.out.println(sylas.getDescription());
    }
}
