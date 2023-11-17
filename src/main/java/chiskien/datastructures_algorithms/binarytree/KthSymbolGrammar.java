package chiskien.datastructures_algorithms.binarytree;

public class KthSymbolGrammar {

    public static void main(String[] args) {
        KthSymbolGrammar kthSymbolGrammar = new KthSymbolGrammar();
        System.out.println(kthSymbolGrammar.kthGrammar(4,4));
    }

    public int kthGrammar(int n, int k) {

        // for each lv of n, we replace the previous 0 -> 01, previous 1->10
        //find the kth symbol in nth line
        //constraints:  1 <= k <= Math.pow(2, n-1);
        //example: n = 1, -> sequence = 0, k = 0

        //solution:
        int current = 0;
        int left = 0;
        int right = (int) Math.pow(2, n-1);
        int i = 0;
        while (i < n -1) {
            int mid = (right - left) / 2 + left;
            if (k <= mid) {
                right = mid;
            } else {
                left = mid + 1;
                current = (current == 0) ? 1 : 0;
            }
            i++;
        }
        return current;
    }
}
