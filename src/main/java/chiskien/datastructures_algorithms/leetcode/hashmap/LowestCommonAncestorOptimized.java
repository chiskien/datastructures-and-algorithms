package chiskien.datastructures_algorithms.leetcode.hashmap;

import chiskien.datastructures_algorithms.leetcode.binarytree.TreeNode;

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

//This time, using a hash table for optimizing the solution, especially for close ancestors
//The time complexity should rely on the DISTANCE from the nodes to the LCA
//TreeNode have a parent pointer
    public TreeNode lowestCommonAncestor(TreeNode node0, TreeNode node1) {
        Set<TreeNode>
    }
}
