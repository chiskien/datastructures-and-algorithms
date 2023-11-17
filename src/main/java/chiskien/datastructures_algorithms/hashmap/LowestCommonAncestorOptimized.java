package chiskien.datastructures_algorithms.hashmap;

import chiskien.datastructures_algorithms.binarytree.TreeNode;

import java.util.HashSet;
import java.util.Set;


//Problem: Find the Lowest Common Ancestor (LCA) of Two Nodes
//                     (1)
//                  /       \
//                (2)       (3)
//                /  \     /    \
//              (4) (14)  (22) (23)
// The LCA of (4) and (14) is (2)
// The LCA of (22) and (2) is (1)

// The same problem has been solved in binarytree/LowestCommonAncestor.java

public class LowestCommonAncestorOptimized {

    //This time, using a hash table for optimizing the solution, especially for close ancestors.
    //The time complexity should rely on the DISTANCE from the nodes to the LCA
    //TreeNode have a parent pointer

    public static void main(String[] args) {
        TreeNode root = new TreeNode(25);
        root.left = new TreeNode(20, root);
        root.right = new TreeNode(30, root);
        root.left.left = new TreeNode(25, root.left);
        root.left.right = new TreeNode(30, root.left);
        root.right.left = new TreeNode(36, root.right);
        root.right.right = new TreeNode(10, root.right);
        root.right.right.left = new TreeNode(300, root.right.right);
        TreeNode p = root.right.right.left;
        root.right.right.right = new TreeNode(700, root.right.right);
        root.right.right.right.right = new TreeNode(600, root.right.right.right);
        TreeNode q = root.right.right.right.right;
        System.out.println(lowestCommonAncestor(p, q));
    }

    public static TreeNode lowestCommonAncestor(TreeNode node0, TreeNode node1) {
        Set<TreeNode> treeNodeHashSet = new HashSet<>();
        while (node0 != null || node1 != null) {
            if (node0 != null) {
                //if hashSet contains the value, the set remains unchanged and return false;
                if (!treeNodeHashSet.add(node0)) {
                    return node0;
                }
                node0 = node0.parent;

            }
            if (node1 != null) {
                if (!treeNodeHashSet.add(node1)) {
                    return node1;
                }
                node1 = node1.parent;
            }
        }
        throw new IllegalArgumentException(node0 + " and " + node1 + " are not in the same tree");
    }
}
