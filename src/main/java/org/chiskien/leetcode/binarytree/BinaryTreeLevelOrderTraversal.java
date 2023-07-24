package org.chiskien.leetcode.binarytree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> treeRepresentation = new LinkedList<>();
        treeRepresentation.add(root);
        while (!treeRepresentation.isEmpty()) {
            int size = treeRepresentation.size();
            List<Integer> listNodeValue = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = treeRepresentation.removeFirst();
                if (node != null) {
                    listNodeValue.add(node.val);
                    treeRepresentation.addLast(node.left);
                    treeRepresentation.addLast(node.right);
                }
            }
            if (!listNodeValue.isEmpty()) {
                result.add(listNodeValue);
            }
        }
        return result;
    }
}
