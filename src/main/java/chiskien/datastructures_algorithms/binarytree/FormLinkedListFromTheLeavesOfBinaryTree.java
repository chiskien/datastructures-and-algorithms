package chiskien.datastructures_algorithms.binarytree;

import java.util.LinkedList;
import java.util.List;

public class FormLinkedListFromTheLeavesOfBinaryTree {


    public List<TreeNode> buildListOfLeaves(TreeNode root) {
        List<TreeNode> list = new LinkedList<>();
        addLeavesLeftToRight(root, list);
        return list;
    }

    private void addLeavesLeftToRight(TreeNode root, List<TreeNode> list) {
        if (root != null) {
            if (root.left != null && root.right != null) {
                list.add(root);
            } else {
                addLeavesLeftToRight(root.left, list);
                addLeavesLeftToRight(root.right, list);
            }
        }
    }
}
