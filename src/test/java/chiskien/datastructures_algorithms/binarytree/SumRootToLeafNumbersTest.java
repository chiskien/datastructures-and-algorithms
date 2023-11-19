package chiskien.datastructures_algorithms.binarytree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumRootToLeafNumbersTest {
    SumRootToLeafNumbers sumRootToLeafNumbers;

    @BeforeEach
    void setUp() {
        sumRootToLeafNumbers = new SumRootToLeafNumbers();
    }

    @Test
    void sumNumbers() {
        TreeNode root = new TreeNode(4);
        TreeNode.linkLeft(root, new TreeNode(9));
        TreeNode.linkRight(root, new TreeNode(0));
        TreeNode.linkLeft(root.left, new TreeNode(5));
        TreeNode.linkRight(root.left, new TreeNode(1));
        System.out.println(root);
        assertEquals(1026, sumRootToLeafNumbers.sumNumbers(root));
    }
}