package chiskien.datastructures_algorithms.leetcode.array;

import chiskien.datastructures_algorithms.leetcode.binarytree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class FindSmallestPath {
    private static int minSum = Integer.MAX_VALUE;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        dfs(root,0);
        System.out.println(minSum  );
    }
    private static void dfs(TreeNode node, int currentSum) {
        if (node == null) {
            return;
        }

        currentSum += node.val;

        // Check if it's a leaf node
        if (node.left == null && node.right == null) {
            minSum = Math.min(minSum, currentSum);
            return;
        }

        // Continue DFS for left and right children
        dfs(node.left, currentSum);
        dfs(node.right, currentSum);
    }

    //using BFS or DFS
//    public static int findSmallestPath(TreeNode root) {
//        int sum = 0;
//        int smallest = Integer.MAX_VALUE;
//        Deque<TreeNode> queue = new LinkedList<>();
//        Deque<Integer> totalSum = new LinkedList<>();
//        queue.addFirst(root);
//        totalSum.addFirst(root.val);
//        while (!queue.isEmpty()) {
//            TreeNode n = queue.removeFirst();
//            int currentSum = totalSum.removeFirst();
//            if (n != null) {
//                sum += n.val;
//                if (currentSum < smallest) {
//                    smallest = currentSum;
//                    sum = n.val;
//                }
//                if (n.left != null) {
//                    queue.addFirst(n.left);
//                    totalSum.addFirst(currentSum + n.left.val);
//                }
//                if (n.right != null) {
//                    queue.addFirst(n.right);
//                    totalSum.addFirst(currentSum + n.right.val);
//                }
//            }
//        }
//        return sum;
//    }
}

