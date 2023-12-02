package chiskien.datastructures_algorithms.recursion;

public class TriangularNumber {


    public int findNthValue(int n) {
        int total = 0;
        while (n-- > 0) {
            total += n;
        }
        return total;
    }
}
