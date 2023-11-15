package chiskien.datastructures_algorithms.leetcode.binarytree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InorderTraversalWithoutRecursionTest {
    InorderTraversalWithoutRecursion inorderTraversalWithoutRecursion;

    @BeforeEach
    void setUp() {
        inorderTraversalWithoutRecursion = new InorderTraversalWithoutRecursion();
    }

    @AfterEach
    void tearDown() {
        System.gc();
    }

    @Test
    void inorderTraversal() {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.right = new TreeNode(11);
        List<Integer> expected = List.of(10, 20, 11);
        List<Integer> actual = inorderTraversalWithoutRecursion.inorderTraversal(root);
        assertEquals(expected, actual);
    }
}