package chiskien.datastructures_algorithms.binarytree;

import chiskien.datastructures_algorithms.binarytree.SymmetricTree;
import chiskien.datastructures_algorithms.binarytree.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {
    SymmetricTree symmetricTree;

    @BeforeEach
    void setUp() {
        symmetricTree = new SymmetricTree();
    }

    @AfterEach
    void tearDown() {
        System.gc();
    }

    @Test
    void normalCase1() {
        TreeNode root = new TreeNode(22);
        root.left = new TreeNode(232);
        root.right = new TreeNode(232);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(3);
        assertTrue(symmetricTree.isSymmetric(root));
    }
}