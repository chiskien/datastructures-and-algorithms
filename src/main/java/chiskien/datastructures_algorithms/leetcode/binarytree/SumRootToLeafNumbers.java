package chiskien.datastructures_algorithms.leetcode.binarytree;

public class SumRootToLeafNumbers {


    public int sumNumbers(TreeNode root) {
        return sumNumbersHelper(root, 1, 0);
    }

    private int sumNumbersHelper(TreeNode root, int base, int number) {
        if (root == null) return 0;

        number += root.val * 10 * base++;
        //leaf
        if (root.left == null && root.right == null) {
            return number;
        }
        return sumNumbersHelper(root.left, base, number) + sumNumbersHelper(root.right, base, number);
    }
}
