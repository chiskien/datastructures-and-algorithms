package chiskien.datastructures_algorithms.binarytree;

public class SumRootToLeafPaths {

    public int sumNumber(TreeNode root) {
        return sumRootToLeafHelper(root, 0);
    }

    public int sumRootToLeafHelper(TreeNode root, int partialPathSum) {
        //base case
        if (root == null) {
            return 0;
        }
        partialPathSum = partialPathSum * 2 + root.val;
        //leaf
        if (root.left == null && root.right == null) {
            return partialPathSum;
        }
        return sumRootToLeafHelper(root.left, partialPathSum)
                + sumRootToLeafHelper(root.right, partialPathSum);
    }
}
