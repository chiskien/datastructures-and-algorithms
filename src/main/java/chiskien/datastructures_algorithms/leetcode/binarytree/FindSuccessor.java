package chiskien.datastructures_algorithms.leetcode.binarytree;

public class FindSuccessor {

    public TreeNode findSuccessor(TreeNode root) {
        TreeNode treeIter = root;
        if (treeIter.right != null) {

            //find the leftmost element in node's right subtree
            treeIter = treeIter.right;
            while (treeIter.left != null) {
                treeIter = treeIter.left;
            }
            return treeIter;
        }
        // Find the closest ancestor whose left subtree contains a node.
        while (treeIter.parent != null && treeIter.parent.right == treeIter) {
            treeIter = treeIter.parent;
        }
        // A return value of null means the node does not have a successor,
        // the rightmost node in the tree.
        return treeIter.parent;
    }
}
