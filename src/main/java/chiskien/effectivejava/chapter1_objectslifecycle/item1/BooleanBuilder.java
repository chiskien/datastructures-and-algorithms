package chiskien.effectivejava.chapter1_objectslifecycle.item1;

import java.math.BigInteger;
import java.util.Random;

public class BooleanBuilder {
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

    public static void main(String[] args) {
        probalyPrime();
    }

    public static BigInteger probalyPrime() {
        Random random = new Random();
        BigInteger b = BigInteger.probablePrime(2, random);
        System.out.println(b);
        return b;
    }
}
