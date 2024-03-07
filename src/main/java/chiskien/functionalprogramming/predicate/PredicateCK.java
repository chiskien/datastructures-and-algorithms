package chiskien.functionalprogramming.predicate;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateCK {


    static IntPredicate over9000 = integer -> integer >= 9000;
    static DoublePredicate over20000 = doublee -> doublee >= 20000.0;

    static Predicate<String> isNotBlank = String::isBlank;

    static BiPredicate<Subject, Subject> predicate = Subject::equals;

    public static void main(String[] args) {
        System.out.println(over20000.test(20000));
        Subject javaSub = Subject.builder().sid(221).title("Java OOP").build();
        Subject csharpSub = Subject.builder().sid(2333).title("C# OOP").build();
        System.out.println(isNotBlank.negate().test(""));
        System.out.println(predicate.test(javaSub, csharpSub));
    }
}
