package chiskien.datastructures_algorithms.binarytree;


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeTraversal {

    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        if (root != null) {
            inOrderTraversal(root.left);
            inorder.add(root.val);
            inOrderTraversal(root.right);
        }
        return inorder;
    }


    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        if (root != null) {
            preorder.add(root.val);
            System.out.println(root.val);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
        return preorder;
    }

    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            postorder.add(root.val);
        }
        return postorder;
    }

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

    public List<Integer> breadthFirstSearch(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> treeTraversal = new LinkedList<>();
        treeTraversal.add(root);
        while (!treeTraversal.isEmpty() && root != null) {
            TreeNode n = treeTraversal.removeFirst();
            if (n != null) {
                result.add(n.val);
                treeTraversal.addLast(n.left);
                treeTraversal.addLast(n.right);
            }
        }
        return result;
    }

}

