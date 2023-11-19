package chiskien.datastructures_algorithms.binarytree;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumRootToLeafPathsTest {
    SumRootToLeafPaths sumRootToLeafPaths;

    @BeforeEach
    void setUp() {
        sumRootToLeafPaths = new SumRootToLeafPaths();
    }

    @Test
    void normalCase1() {
        TreeNode root = new TreeNode(4);
        TreeNode.linkLeft(root, new TreeNode(9));
        TreeNode.linkRight(root, new TreeNode(0));
        TreeNode.linkLeft(root.left, new TreeNode(5));
        TreeNode.linkRight(root.left, new TreeNode(1));
        assertEquals(1026, sumRootToLeafPaths.sumNumber(root));
    }

}