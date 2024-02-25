package chiskien.datastructures_algorithms.math;

public class PlusOneVariant {
    //Variant: Write a program which takes as input two strings s and t of bits encoding binary numbers Bs and B, respectively, and returns a new string of bits representing
    //the number Bs + Bt.
    public static void main(String[] args) {
        PlusOneVariant plusOneVariant = new PlusOneVariant();
        System.out.println(Integer.parseInt(plusOneVariant.bitsRepresentation("10", "10"), 2));
    }

    public String bitsRepresentation(String s, String t) {
        // s is bits encoding of binary number B1
        // t is bits encoding of binary number B2
        //return bit of B1 + B2
        int num1 = Integer.parseInt(s, 2);
        int num2 = Integer.parseInt(t, 2);
        return Integer.toBinaryString(num2 + num1);
    }
}
