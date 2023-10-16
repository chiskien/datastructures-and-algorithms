package org.chiskien.datastructures_algorithms.leetcode.recursion;

public class GreatestCommonDivisor {


    //the GCD of two numbers x and y is
    //if y > x then the GCD is the GCD of x and y-x
    //simplified is the GCD of x and y % x
    public long findGreatestCommonDivisor(long a, long b) {

        return (b == 0) ? a : findGreatestCommonDivisor(b, a % b);
    }
}
