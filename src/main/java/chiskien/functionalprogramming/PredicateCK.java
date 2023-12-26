package chiskien.functionalprogramming;

import java.util.function.IntPredicate;

public class PredicateCK {


    static IntPredicate over9000 = integer -> integer >= 9000;

    public static void main(String[] args) {
        assert (over9000.test(220));
    }
}
