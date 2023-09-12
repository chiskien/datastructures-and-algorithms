package org.chiskien.datastructures.leetcode.binarytree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SideViewTree {


    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> treeRepresentation = new LinkedList<>();
        treeRepresentation.add(root);

        while (!treeRepresentation.isEmpty()) {
            TreeNode rightMost = null;
            int size = treeRepresentation.size();
            for (int i = 0; i < size; i++) {
                TreeNode n = treeRepresentation.removeFirst();
                if (n != null) {
                    rightMost = n;
                    treeRepresentation.addLast(n.left);
                    treeRepresentation.addLast(n.right);
                }
            }
            if (rightMost != null) {
                result.add(rightMost.val);
            }
        }

        return result;
    }
}
