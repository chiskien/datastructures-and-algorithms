package chiskien.datastructures_algorithms.binarytree;


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeTraversal {

    public static List<Integer> breadthFirstTraversal(TreeNode root) {
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
    public static List<TreeNode> breadthFirstTraversalTreeNode(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        Deque<TreeNode> treeTraversal = new LinkedList<>();
        treeTraversal.add(root);
        while (!treeTraversal.isEmpty() && root != null) {
            TreeNode n = treeTraversal.removeFirst();
            if (n != null) {
                result.add(n);
                treeTraversal.addLast(n.left);
                treeTraversal.addLast(n.right);
            }
        }
        return result;
    }

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

}

