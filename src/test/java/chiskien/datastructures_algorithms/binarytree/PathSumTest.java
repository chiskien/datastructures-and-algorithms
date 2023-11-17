package chiskien.datastructures_algorithms.binarytree;

import chiskien.datastructures_algorithms.binarytree.RootToLeafPathWithSpecifiedSum;
import chiskien.datastructures_algorithms.binarytree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PathSumTest {
    RootToLeafPathWithSpecifiedSum rootToLeafPathWithSpecifiedSum;

    @BeforeEach
    void setUp() {
        rootToLeafPathWithSpecifiedSum = new RootToLeafPathWithSpecifiedSum();
    }

    @Test
    void pathSum1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        assertTrue(rootToLeafPathWithSpecifiedSum.hasPathSum(root, 6));
    }

}