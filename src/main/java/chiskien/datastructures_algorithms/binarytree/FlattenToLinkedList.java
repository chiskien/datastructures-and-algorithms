package chiskien.datastructures_algorithms.binarytree;

import java.util.Deque;

public class FlattenToLinkedList {

    public void flatten(TreeNode root) {

    }

    public TreeNode flattenHelper(TreeNode root, TreeNode rightChild) {
        if (root.left == null && root.right == null) {
            root.right = rightChild;
            return root;
        }
        root.right = flattenHelper(root.left, root.right);
        return root;
    }

}
