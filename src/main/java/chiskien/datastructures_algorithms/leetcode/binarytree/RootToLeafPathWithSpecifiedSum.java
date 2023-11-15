package chiskien.datastructures_algorithms.leetcode.binarytree;

public class RootToLeafPathWithSpecifiedSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSumHelper(root, 0, targetSum);
    }

    private boolean hasPathSumHelper(TreeNode root, int partialPathSum,
                                     int targetSum) {
        if (root == null) {
            return false;
        }
        partialPathSum += root.val;

        if (root.left == null && root.right == null) { //leaf
            return partialPathSum == targetSum;
        }

        return hasPathSumHelper(root.left, partialPathSum, targetSum)
                || hasPathSumHelper(root.right, partialPathSum, targetSum);
    }
}
