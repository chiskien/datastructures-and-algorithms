package chiskien.datastructures_algorithms.binarytree;

public class FindTheKthNodeInAnInorderTraversal {

    public TreeNode findKthNode(TreeNode root, int k) {
        //brute-force: perform inorder traversal and search for the kth
        //time complexity is O(n)

        // if k > left subtree nodes, assume left subtree has L nodes
        // then k is on right subtree at (k-L)th in right subtree
        TreeNode iter = root;
        while (iter != null) {
            int leftSize = iter.left != null ? iter.left.val : 0;
        }

        return null;
    }

}
