package chiskien.datastructures_algorithms.leetcode.math;

public class SquarePow {


    public double myPow(double x, int n) {
        double result = 1.0;
        long power = n;
        if (n < 0) {
            power = -power;
            x = 1.0 / x;
        }
        while (power != 0) {
            if ((power & 1) != 0) {
                result *= x;
            }
            x *= x;
            power >>>= 1;
        }
        return result;
    }
}
