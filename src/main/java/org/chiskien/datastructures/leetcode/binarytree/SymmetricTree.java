package org.chiskien.datastructures.leetcode.binarytree;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return root == null || checkSymmetric(root.left, root.right);
    }

    private boolean checkSymmetric(TreeNode subTree1, TreeNode subTree2) {
        if (subTree1 == null && subTree2 == null) {
            return true;
        } else if (subTree1 != null && subTree2 != null) {
            return subTree1.val == subTree2.val
                    && checkSymmetric(subTree1.left, subTree2.right)
                    && checkSymmetric(subTree1.right, subTree2.left);
        }
        return false;
    }
}
