package chiskien.datastructures_algorithms.math;

public class PowerOfFour {
    public static void main(String[] args) {
        PowerOfFour p = new PowerOfFour();
        System.out.println(p.isPowerOfFour(5));
    }

    //without loops/recursion

    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        double a = Math.log10(4);
        double b = Math.log10(n);
        double result = a / b;
        return Double.compare(result, (int) result) == 0;
    }
}
