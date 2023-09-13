package org.chiskien.datastructures_algorithms.leetcode.binarytree;

import com.sun.source.tree.Tree;

public class SumRootToLeafPaths {
    public static void main(String[] args) {
        SumRootToLeafPaths sumRootToLeafPaths = new SumRootToLeafPaths();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(sumRootToLeafPaths.sumNumber(root));
    }

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
