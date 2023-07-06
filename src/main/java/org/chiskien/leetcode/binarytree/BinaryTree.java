package org.chiskien.leetcode.binarytree;


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.left.left = new TreeNode(110);
        root.left.right = new TreeNode(30);
        root.right = new TreeNode(50);
        root.right.left = new TreeNode(1000);
        root.right.right = new TreeNode(56045);
        inOrderTraversal(root);
        System.out.println("");
        System.out.println(inOrderTraversalWithoutRecursion(root));
    }

    public static void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void preOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public static void postOrderTraversal(TreeNode root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root.val);
        }
    }

    public static List<Integer> inOrderTraversalWithoutRecursion(TreeNode root) {
        Deque<TreeNode> vessel = new LinkedList<>();
        TreeNode current = root;
        List<Integer> result = new ArrayList<>();
        while (!vessel.isEmpty() || current != null) {
            if (current != null) {
                vessel.addFirst(current);
                current = current.left;
            } else {
                current = vessel.removeFirst();
                result.add(current.val);
                current = current.right;

            }
        }
        return result;

    }

    public static int maxDepth(TreeNode root) {
        int maxDepth = 0;
        int count = 0;
            return maxDepth;
    }

}

