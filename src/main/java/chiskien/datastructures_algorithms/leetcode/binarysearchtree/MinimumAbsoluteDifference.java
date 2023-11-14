package chiskien.datastructures_algorithms.leetcode.binarysearchtree;

import chiskien.datastructures_algorithms.leetcode.binarytree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class MinimumAbsoluteDifference {

    public int getMinimumDifference(TreeNode root) {
        Deque<TreeNode> treeQueue = new LinkedList<>();
        treeQueue.addFirst(root);
        int min = Integer.MAX_VALUE;
        while (!treeQueue.isEmpty()) {

        }
        return min;
    }
}
