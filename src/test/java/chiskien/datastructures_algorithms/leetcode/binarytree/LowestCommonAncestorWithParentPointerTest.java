package chiskien.datastructures_algorithms.leetcode.binarytree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorWithParentPointerTest {
    LowestCommonAncestorWithParentPointer lowestCommonAncestorWithParentPointer;

    @BeforeEach
    void setUp() {
        lowestCommonAncestorWithParentPointer = new LowestCommonAncestorWithParentPointer();
    }

    @AfterEach
    void tearDown() {
        System.gc();
    }

    @Test
    void findLCA() {
        TreeNode root = new TreeNode(223);
        root.left = new TreeNode(123, root);
        TreeNode lca = new TreeNode(231, root);
        root.right = lca;
        root.left.left = new TreeNode(224, root.left);
        root.left.right = new TreeNode(223, root.left);
        lca.left = new TreeNode(211, root.right);
        lca.right = new TreeNode(6556, root.right);
        lca.right.right = new TreeNode(211, root.right.right);


    }
}