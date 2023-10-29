package chiskien.datastructures_algorithms.leetcode.binarytree;

public class TreeNode {
    public int val;
    public TreeNode right;
    public TreeNode left;
    public TreeNode parent;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode buildBST(int[] nodes) {
        TreeNode root = new TreeNode(nodes[0]);
        for (int i = 1; i < nodes.length; i++) {
            TreeNode newNode = new TreeNode(nodes[i]);
            addBSTNode(root, newNode);
        }
        return root;
    }

    public static void addBSTNode(TreeNode root, TreeNode newNode) {
        if (root != null) {
            TreeNode current = root;
            TreeNode parent = current;
            while (current != null) {
                parent = current;
                if (newNode.val > current.val) {
                    current = current.right;
                } else if (newNode.val < current.val) {
                    current = current.left;
                }
            }
            if (newNode.val < parent.val) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
        }
    }

    @Override
    public String toString() {
        return "TreeNode{ " +
                "val=" + val + ", left=" + left + ", right=" + right +
                " }";
    }
}
