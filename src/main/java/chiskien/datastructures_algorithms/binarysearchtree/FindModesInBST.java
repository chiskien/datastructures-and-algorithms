package chiskien.datastructures_algorithms.binarysearchtree;

import chiskien.datastructures_algorithms.binarytree.TreeNode;

import java.util.*;

public class FindModesInBST {


    public List<Integer> findMode(TreeNode root) {
        Map<Integer, Integer> frequency = new HashMap<>();
        Deque<TreeNode> treeQueue = new LinkedList<>();
        treeQueue.addFirst(root);
        while (!treeQueue.isEmpty()) {
            TreeNode n = treeQueue.removeFirst();
            if (n != null) {
                if (frequency.containsKey(n.val)) {
                    frequency.put(n.val, frequency.get(n.val) + 1);
                } else {
                    frequency.put(n.val, 1);
                }
                if (n.left != null) treeQueue.addLast(n.left);
                if (n.right != null) treeQueue.addLast(n.right);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
