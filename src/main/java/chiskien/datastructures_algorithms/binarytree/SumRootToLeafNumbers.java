package chiskien.datastructures_algorithms.binarytree;

public class SumRootToLeafNumbers {


    public int sumNumbers(TreeNode root) {
        return sumNumbersHelper(root, 0);

    }

    private int sumNumbersHelper(TreeNode root, int number) {
        if (root == null) return 0;

        number = 10 * number + root.val;
        //leaf
        if (root.left == null && root.right == null) {
            return number;
        }
        return sumNumbersHelper(root.left, number) +
                sumNumbersHelper(root.right, number);
    }
}
