package chiskien.datastructures_algorithms.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversalWithO1Space {


    //Implement an algorithm inorder traversal which space complexity is O(1)
    //
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode previous = null;
        TreeNode current = root;
        List<Integer> result = new ArrayList<>();
        while (current != null) {
            TreeNode next;
            if (current.parent == previous) {
                //We came down to curr from prev
                if (current.left != null) {
                    next = current.left;
                } else {
                    result.add(current.val);
                    //done with the left, so go right if the right is not empty
                    //otherwise go up
                    next = (current.right != null) ? current.right :
                            current.parent;
                }
            } else if (current.left == previous) {
                result.add(current.val);
                //done with the left, so go right if the right is not empty
                //otherwise go up
                next = (current.right != null) ? current.right :
                        current.parent;
            } else {
                next = current.parent;
            }
            previous = current;
            current = next;
        }
        return result;
    }
}
