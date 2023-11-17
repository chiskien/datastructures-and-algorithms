package chiskien.datastructures_algorithms.binarytree;

import java.util.Deque;
import java.util.LinkedList;

public class MaxDepth {

    public static int maxDepth(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        int level = 1;
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            if (current != null) {
                boolean hasChild = (current.left != null || current.right != null);
                if (hasChild) {
                    level += 1;
                }
                stack.addFirst(current.right);
                stack.addFirst(current.left);
            }
        }
        return level;
    }
}
