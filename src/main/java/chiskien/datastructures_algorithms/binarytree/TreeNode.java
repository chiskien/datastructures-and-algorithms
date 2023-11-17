package chiskien.datastructures_algorithms.binarytree;

public class TreeNode {
    public int val;
    public TreeNode right;
    public TreeNode left;
    public TreeNode parent;


    //Need to apply static factory instead of multiple constructors
    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = this.parent = null;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.parent = null;
    }

    public TreeNode(int val, TreeNode left, TreeNode right, TreeNode parent) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }

    public TreeNode(int val, TreeNode parent) {
        this.val = val;
        this.parent = parent;
        this.left = this.right = null;
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

    public static int getDepth(TreeNode root) {
        int depth = 0;
        while (root.parent != null) {
            depth++;
            root = root.parent;
        }
        return depth;
    }

    public static void linkLeft(TreeNode parent, TreeNode leftChild) {
        if (parent.left == null && leftChild.parent == null) {
            parent.left = leftChild;
            leftChild.parent = parent;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void linkRight(TreeNode parent, TreeNode rightChild) {
        if (parent.right == null && rightChild.parent == null) {
            parent.right = rightChild;
            rightChild.parent = parent;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return "TreeNode{ " +
                "val=" + val + ", left=" + left + ", right=" + right +
                " }";
    }
}
