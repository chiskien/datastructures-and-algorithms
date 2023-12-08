package chiskien.datastructures_algorithms.binarytree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ConstructStringFromBinaryTree {
    static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        System.out.println(tree2str(root));
    }

    public static String tree2str(TreeNode root) {
        preOrderTraversal(root);
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }
    public static String preOrderTraversal(TreeNode root) {
        if (root != null) {
            if (root.left != null || root.right != null) {
                stringBuilder.append(root.val).append("(");
            } else {
                stringBuilder.append(root.val);
            }
            if (root.left == null && root.right != null) {
                stringBuilder.append(")(");
            }
            preOrderTraversal(root.left);
            if (root.left != null && root.right != null) {
                stringBuilder.append("(");
            }
            preOrderTraversal(root.right);
            stringBuilder.append(")");
        }
        return stringBuilder.toString();
    }
}
