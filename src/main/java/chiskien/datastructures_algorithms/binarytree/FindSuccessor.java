package chiskien.datastructures_algorithms.binarytree;

public class FindSuccessor {

    //the successor of a node in binary tree is the node that appears immediately after the given node inorder traversal
    //assumes each nodes stores its parent
    //Left-most of the right subtree is the successor
    public TreeNode findSuccessor(TreeNode root) {
        TreeNode current = root;
        if (current.right != null) {
            //Find the left-most of right subtree
            current = current.right;
            while (current.left != null) {
                current = current.left;
            }
            return current;
        }
        //Find the closet ancestor whose left substree contains nodes
        while (current.parent != null && current.parent.right == current) {
            current = current.parent;
        }
        //A return value of null means node does not have successor (right-most of the tree)
        return current.parent;
    }
}
