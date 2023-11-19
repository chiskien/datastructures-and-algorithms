package chiskien.datastructures_algorithms.binarytree;

public class SumRootToLeafNumbers {

    int result = 0;

    public int sumNumbers(TreeNode root) {
        sumNumbersHelper(root, 0);
        return result;
    }

    private void sumNumbersHelper(TreeNode root, int number) {
        if (root == null) return;

        number = 10 * number + root.val;
        //leaf
        if (root.left == null && root.right == null) {
            result += number;
        }
        sumNumbersHelper(root.left, number);
        sumNumbersHelper(root.right, number);
    }
}
