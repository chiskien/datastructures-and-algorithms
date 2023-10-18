package chiskien.datastructures_algorithms.leetcode.binarytree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class AverageLevels {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Deque<TreeNode> treeRepresentation = new LinkedList<>();
        treeRepresentation.add(root);
        while (!treeRepresentation.isEmpty()) {
            double average;
            long sum = 0;
            int size = treeRepresentation.size();
            int count = 0;
            for (int i = 0; i < size; i++) {
                TreeNode n = treeRepresentation.removeFirst();
                if (n != null) {
                    count++;
                    sum += n.val;
                    if (n.left != null || n.right != null) {
                        treeRepresentation.addLast(n.left);
                        treeRepresentation.addLast(n.right);
                    }
                }
            }
            average = (double) sum / count;
            result.add(average);
        }
        return result;
    }
}
