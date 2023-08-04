package org.chiskien.leetcode.binarytree;

public class ValidBST {

    public boolean isValidBST(TreeNode root) {
        return areKeysInRange(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean areKeysInRange(TreeNode root, int lower, int upper) {
        if (root == null) {
            return true;
        } else if (root.val < lower || root.val > upper) {
            return false;
        } else {
        return areKeysInRange(root.left, lower, root.val) &&
                areKeysInRange(root.right, root.val, upper);
        }
    }
}
