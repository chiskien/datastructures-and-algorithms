package chiskien.datastructures_algorithms.leetcode.binarytree.practices;

import chiskien.datastructures_algorithms.leetcode.binarytree.TreeNode;

public class LowestCommonAncestors {

    //Write a program that finds the LCA of two nodes n and m in a binary tree
    // in which nodes do not have a parent field

    public TreeNode findLowestCommonAncestor(TreeNode root, TreeNode node1, TreeNode node2) {
        return LCAHelper(root, node1, node2).ancestor;
    }

    public Status LCAHelper(TreeNode tree, TreeNode node1, TreeNode node2) {
        if (tree == null) {
            return new Status(0, null);
        }
        Status leftResult = LCAHelper(tree.left, node1, node2);
        if (leftResult.numTargetNodes == 2) {
            //found both nodes in left subtree
            return leftResult;
        }
        Status rightResult = LCAHelper(tree.right, node1, node2);
        if (rightResult.numTargetNodes == 2) {
            return rightResult;
        }
        int numTargetNodes = leftResult.numTargetNodes + rightResult.numTargetNodes
                + (tree == node1 ? 1 : 0) + (tree == node2 ? 1 : 0);
        return new Status(numTargetNodes, numTargetNodes == 2 ? tree : null);
    }

    public static class Status {
        public int numTargetNodes;
        public TreeNode ancestor;

        public Status(int numTargetNodes, TreeNode node) {
            this.ancestor = node;
            this.numTargetNodes = numTargetNodes;
        }
    }
}
