package chiskien.datastructures_algorithms.leetcode.math;

public class IsPalindrome {


    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int reverse = 0;
        int number = x;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        return x == reverse;
    }
}
