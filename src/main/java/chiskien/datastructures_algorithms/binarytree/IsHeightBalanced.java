package chiskien.datastructures_algorithms.binarytree;

public class IsHeightBalanced {

    //A binary tree is said to be height-balanced if for each node in the tree,
    //the difference in the height of its left and right subtrees is at most one
    //A perfect binary tree is height-balanced, as is a complete binary tree

    //Write a program that takes as input the root of the tree and checks whether the
    //tree is height-balanced

    public static void main(String[] args) {
        IsHeightBalanced isHeightBalanced = new IsHeightBalanced();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(20);
        System.out.println(isHeightBalanced.isBalanced(root));
    }

    public boolean isBalanced(TreeNode root) {
        return checkBalanced(root).isBalanced;
    }

    private BalanceStatusWithHeight checkBalanced(TreeNode node) {
        if (node == null)
            return new BalanceStatusWithHeight(true, -1);
        BalanceStatusWithHeight leftResult = checkBalanced(node.left);
        if (!leftResult.isBalanced) {
            return leftResult; //the left subtree is not balanced
        }
        BalanceStatusWithHeight rightResult = checkBalanced(node.right);
        if (!rightResult.isBalanced) {
            return rightResult; //the right subtree is not balanced
        }
        int diff = Math.abs(leftResult.height - rightResult.height);
        boolean isBalanced = diff <= 1;
        int height = Math.max(leftResult.height, rightResult.height) + 1;
        return new BalanceStatusWithHeight(isBalanced, height);

    }

    public record BalanceStatusWithHeight(boolean isBalanced, int height) {

    }

}

