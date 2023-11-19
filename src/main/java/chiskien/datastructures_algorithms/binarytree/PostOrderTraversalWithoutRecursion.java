package chiskien.datastructures_algorithms.binarytree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PostOrderTraversalWithoutRecursion {


    public List<Integer> postOrderTraversalWithoutRecursion(TreeNode root) {
        Deque<TreeNode> path = new LinkedList<>();
        TreeNode prev = root;
        TreeNode current;
        List<Integer> result = new ArrayList<>();
        path.push(root);
        while (!path.isEmpty()) {
            current = path.peek();
            boolean hasChild = (current.left != null || current.right != null);
            boolean isPrevLastChild = (prev == current.right || prev == current.left
                    && current.right == null);
            if (!hasChild || isPrevLastChild) {
                current = path.pop();
                result.add(current.val);
                prev = current;
            } else {
                if (current.right != null) {
                    path.push(current.right);
                }
                if (current.left != null) {
                    path.push(current.left);
                }
            }
        }
        return result;
    }
}
