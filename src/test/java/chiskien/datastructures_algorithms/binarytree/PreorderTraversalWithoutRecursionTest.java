package chiskien.datastructures_algorithms.binarytree;

import chiskien.datastructures_algorithms.binarytree.PreorderTraversalWithoutRecursion;
import chiskien.datastructures_algorithms.binarytree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PreorderTraversalWithoutRecursionTest {
    PreorderTraversalWithoutRecursion preorderTraversalWithoutRecursion;

    @BeforeEach
    void setUp() {
        preorderTraversalWithoutRecursion = new PreorderTraversalWithoutRecursion();
    }

    @Test
    void preorderTraversal() {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(110);
        root.right = new TreeNode(111);
        List<Integer> expected = List.of(20, 110, 111);
        List<Integer> actual = preorderTraversalWithoutRecursion.preorderTraversal(root);
        assertEquals(expected, actual);
    }
}