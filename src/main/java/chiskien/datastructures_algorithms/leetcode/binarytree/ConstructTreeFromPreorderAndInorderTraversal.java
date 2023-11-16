package chiskien.datastructures_algorithms.leetcode.binarytree;

import java.util.HashMap;
import java.util.Map;

public class ConstructTreeFromPreorderAndInorderTraversal {


    //Write an algorithm to build a binary tree based on their inorder traversal and preorder traversal

    public TreeNode buildTree(int[] inorder, int[] preorder) {
        Map<Integer, Integer> nodeToInorderIndex = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            nodeToInorderIndex.put(inorder[i], i);
        }
        return buildTreeHelper(preorder, 0, preorder.length,
                0, inorder.length, nodeToInorderIndex);

    }

    //Builds the subtree with preorder.subList
    private TreeNode buildTreeHelper(int[] preorder, int preorderStart, int preorderEnd,
                                     int inorderStart, int inorderEnd,
                                     Map<Integer, Integer> nodeToInorderIndex) {

        if (preorderEnd <= preorderStart || inorderEnd <= inorderStart) {
            return null;
        }
        int rootInorderIndex = nodeToInorderIndex.get(preorder[preorderStart]);
        int leftSubTreeSize = rootInorderIndex - inorderStart;
        return new TreeNode(
                preorder[preorderStart],
                buildTreeHelper(preorder,
                        preorderStart + 1,
                        preorderStart + 1 + leftSubTreeSize,
                        inorderStart,
                        rootInorderIndex,
                        nodeToInorderIndex),
                buildTreeHelper(preorder,
                        preorderStart + 1 + leftSubTreeSize,
                        preorderEnd,
                        rootInorderIndex + 1,
                        inorderEnd,
                        nodeToInorderIndex));
    }

}
