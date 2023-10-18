package chiskien.datastructures_algorithms.leetcode.math;

public class TrailingZeroes {
    public static void main(String[] args) {
        TrailingZeroes trailingZeroes = new TrailingZeroes();
        System.out.println(trailingZeroes.trailingZeroes(25));
        System.out.println(trailingZeroes.trailingZeroes(25) / 25);
    }
    public  int trailingZeroes(int n) {
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        return total;
    }
}
