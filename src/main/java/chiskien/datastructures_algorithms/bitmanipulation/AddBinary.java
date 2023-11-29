package chiskien.datastructures_algorithms.bitmanipulation;

public class AddBinary {


    public static String addBinary(String a, String b) {
        int a2 = Integer.parseInt(a, 2);
        int b2 = Integer.parseInt(b, 2);
        int sum = a2 + b2;

        return Integer.toBinaryString(sum);
    }
}
