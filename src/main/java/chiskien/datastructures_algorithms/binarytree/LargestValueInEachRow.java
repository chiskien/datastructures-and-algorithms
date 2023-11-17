package chiskien.datastructures_algorithms.binarytree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LargestValueInEachRow {
    public static void main(String[] args) {
        LargestValueInEachRow largestValueInEachRow = new LargestValueInEachRow();
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(11);
        root.right = new TreeNode(2121);
        root.left.left = new TreeNode(1211);
        root.left.right = new TreeNode(22);
        root.right.right = new TreeNode(2222);
        root.right.left = new TreeNode(5757);
        root.left.left.left = new TreeNode(1232);
        root.left.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(5);
        root.left.right.right = new TreeNode(9);
        System.out.println(root);
        System.out.println(largestValueInEachRow.largestValue(root));
    }
    public List<Integer> largestValue(TreeNode root) {
        Deque<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.addFirst(root);
        List<Integer> result = new ArrayList<>();
        while (!treeNodeQueue.isEmpty()) {
            int size =  treeNodeQueue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode n = treeNodeQueue.removeFirst();
                if (n != null) {
                    if (n.val > max) {
                        max = n.val;
                    }
                    treeNodeQueue.addLast(n.left);
                    treeNodeQueue.addLast(n.right);
                }
            }
            result.add(max);
        }
        result.remove(result.size() -1);
        return result;
    }
}
