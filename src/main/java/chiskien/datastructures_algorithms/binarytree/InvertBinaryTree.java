package chiskien.datastructures_algorithms.binarytree;

import java.util.Deque;
import java.util.LinkedList;

public class InvertBinaryTree {

    public static void main(String[] args) {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.right.left = new TreeNode(6);
        System.out.println(BinaryTreeTraversal.breadthFirstTraversal(root));
        root = invertBinaryTree.invertTree(root);
        System.out.println(BinaryTreeTraversal.breadthFirstTraversal(root));
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public TreeNode invertTreeWithoutRecursion(TreeNode root) {
        Deque<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode n = queue.removeFirst();
                
            }
        }
    }
}
