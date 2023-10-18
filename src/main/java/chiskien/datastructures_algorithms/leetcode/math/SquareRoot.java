package chiskien.datastructures_algorithms.leetcode.math;

public class SquareRoot {


    public int mySqrt(int x) {

        long left = 0, right = x;
        //candidate interval [left, right] where everything before left has square <= k, and everything right has square > k
        while (left <= right) {
            long mid = (right - left) / 2 + left;
            long midSquared = mid * mid;
            if (midSquared <= x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) (left - 1);
    }
}
