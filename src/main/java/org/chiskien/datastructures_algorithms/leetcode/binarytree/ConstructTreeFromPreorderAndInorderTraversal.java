package org.chiskien.datastructures_algorithms.leetcode.binarytree;

import java.util.HashMap;
import java.util.Map;

public class ConstructTreeFromPreorderAndInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> nodeToInorderIndex = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            nodeToInorderIndex.put(inorder[i], i);
        }
        return binaryTreeFromPreorderInorderHelper(
                preorder, 0, preorder.length,
                0, inorder.length, nodeToInorderIndex);
    }


    //Build the subtree with preorder.sublist
    private TreeNode binaryTreeFromPreorderInorderHelper(
            int[] preorder, int preorderStart, int preorderEnd,
            int inorderStart, int inorderEnd,
            Map<Integer, Integer> nodeToInorderIndex) {
        if (preorderEnd <= preorderStart || inorderEnd <= inorderStart) return null;
        int rootInorderIndex = nodeToInorderIndex.get(preorder[preorderStart]);
        int leftSubtreeSize = rootInorderIndex - inorderStart;
        return new TreeNode(
                preorder[preorderStart],
                //Recursively build left subtree
                binaryTreeFromPreorderInorderHelper(
                        preorder,
                        preorderStart + 1,
                        preorderStart + 1 + leftSubtreeSize,
                        inorderStart,
                        rootInorderIndex,
                        nodeToInorderIndex),
                //Recursively build right subtree
                binaryTreeFromPreorderInorderHelper(
                        preorder,
                        preorderStart + 1 + leftSubtreeSize,
                        preorderEnd,
                        rootInorderIndex + 1,
                        inorderEnd,
                        nodeToInorderIndex)
        );
    }
}
