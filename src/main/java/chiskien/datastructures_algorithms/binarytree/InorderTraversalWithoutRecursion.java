package chiskien.datastructures_algorithms.binarytree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class InorderTraversalWithoutRecursion {


    public List<Integer> inorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        TreeNode current = root;
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.addFirst(current);
                //Going left
                current = current.left;
            } else { //reach left-most leave
                //Going up
                //reassign current to first node in stack
                current = stack.removeFirst();
                result.add(current.val);
                current = current.right;
            }
        }
        return result;
    }
}
