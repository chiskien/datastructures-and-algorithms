package chiskien.datastructures_algorithms.binarytree;

import chiskien.datastructures_algorithms.binarytree.BinaryTreeTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructTreeFromPreorderAndInorderTraversalTest {
    BinaryTreeTraversal binaryTreeTraversal;
    ConstructTreeFromPreorderAndInorderTraversal ct;

    @BeforeEach
    void setUp() {
        binaryTreeTraversal = new BinaryTreeTraversal();
        ct = new ConstructTreeFromPreorderAndInorderTraversal();
    }

    @Test
    void buildTree() {
        TreeNode root = new TreeNode(22);
        root.left = new TreeNode(4141);
        root.right = new TreeNode(4141);
    }
}