package chiskien.datastructures_algorithms.binarytree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PreorderTraversalWithoutRecursion {


    public List<Integer> preorderTraversal(TreeNode root) {

        Deque<TreeNode> stack = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        stack.addFirst(root);
        while (!stack.isEmpty()) {
            TreeNode current = stack.removeFirst();
            if (current != null) {
                result.add(current.val);
                stack.addFirst(current.right);
                stack.addFirst(current.left);
            }
        }
        return result;
    }

}
