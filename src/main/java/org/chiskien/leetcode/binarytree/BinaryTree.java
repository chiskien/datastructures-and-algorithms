package org.chiskien.leetcode.binarytree;


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(88);
        root.right.right = new TreeNode(5);
        root.right.left = new TreeNode(20);
        System.out.println(breadthFirstSearch(root));
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

    public static List<Integer> preOrderTraversalWithoutRecursion(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> path = new LinkedList<>();
        path.addFirst(root);
        while (!path.isEmpty()) {
            TreeNode current = path.removeFirst();
            if (current != null) {
                result.add(current.val);
                path.addFirst(current.right);
                path.addFirst(current.left);
            }
        }
        return result;
    }

    public static List<Integer> postOrderTraversalWithoutRecursion(TreeNode root) {
        Deque<TreeNode> path = new LinkedList<>();
        TreeNode prev = root;
        TreeNode current;
        List<Integer> result = new ArrayList<>();
        path.push(root);
        while (!path.isEmpty()) {
            current = path.peek();
            boolean hasChild = (current.left != null || current.right != null);
            boolean isPrevLastChild = (prev == current.right || prev == current.left
                    && current.right == null);
            if (!hasChild || isPrevLastChild) {
                current = path.pop();
                result.add(current.val);
                prev = current;
            } else {
                if (current.right != null) {
                    path.push(current.right);
                }
                if (current.left != null) {
                    path.push(current.left);
                }
            }
        }
        return result;
    }

    public static List<Integer> breadthFirstSearch(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> treeTraversal = new LinkedList<>();
        treeTraversal.add(root);
        while (!treeTraversal.isEmpty() && root != null) {
            TreeNode n = treeTraversal.removeFirst();
            if (n != null) {
                result.add(n.val);
                treeTraversal.addLast(n.left);
                treeTraversal.addLast(n.right);
            }
        }
        return result;
    }

}

