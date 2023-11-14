package chiskien.datastructures_algorithms.leetcode.binarysearchtree;

import chiskien.datastructures_algorithms.leetcode.binarytree.TreeNode;

public class FirstKeyGreaterThanGivenValueBST {


    //write a program takes an input a BST and a value, returns the first key that would appear in an inorder traversal which is greater than the input value
    public static void main(String[] args) {
        TreeNode root = TreeNode.buildBST(new int[]{15,10,20,5,25,7,17,19,22,4});
        FirstKeyGreaterThanGivenValueBST f = new FirstKeyGreaterThanGivenValueBST();
        System.out.println(f.findFirstGreaterThanK(root, 4));
    }

    public TreeNode findFirstGreaterThanK(TreeNode root, int k) {
        TreeNode current = root;
        TreeNode firstSoFar = null;
        while (current != null) {
            if (current.val > k) {
                firstSoFar = current;
                current = current.left;
            } else {
                //Root and all nodes in left-subtree are <= k => skip them
                current = current.right;
            }
        }
        return firstSoFar;
    }
}
