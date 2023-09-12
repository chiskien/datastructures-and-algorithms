package org.chiskien.datastructures.leetcode.binarytree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class KthSmallestElementsInBST {
    public int kthSmallestElement(TreeNode root, int k) {
        Deque<TreeNode> treeRepresentation = new LinkedList<>();
        TreeNode cur = root;
        List<Integer> res = new ArrayList<>();
        while (!treeRepresentation.isEmpty() || cur != null) {
            if (cur != null) {
                treeRepresentation.addFirst(cur);
                cur = cur.left;
            } else { //cur == null
                cur = treeRepresentation.removeFirst();
                res.add(cur.val);
                cur = cur.right;
            }
        }
        return res.get(k - 1);
    }

}
