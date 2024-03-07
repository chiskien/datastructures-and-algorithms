package chiskien.functionalprogramming.streams;


import java.util.function.BiFunction;

public class CustomStreamFunction {

    public static void main(String[] args) {

        BiFunction<String, Double, String> biFunction = (s, aDouble) -> s + aDouble.toString();
        System.out.println(biFunction.andThen(s -> s));
    }
}
