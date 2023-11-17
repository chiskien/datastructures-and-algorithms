package chiskien.datastructures_algorithms.binarytree;

import chiskien.datastructures_algorithms.binarytree.FindSuccessor;
import chiskien.datastructures_algorithms.binarytree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSuccessorTest {
    FindSuccessor findSuccessor;
    TreeNode root, left0, right0, left1, right1;

    @BeforeEach
    void setUp() {
        findSuccessor = new FindSuccessor();
        root = new TreeNode(54);
        left0 = new TreeNode(55);
        left1 = new TreeNode(12);
        right0 = new TreeNode(50);
        right1 = new TreeNode(111);
    }


    @Test
    void findSuccessor() {
        TreeNode.linkLeft(root, left0);
        TreeNode.linkRight(root, right0);
        TreeNode.linkLeft(left0, left1);
        TreeNode.linkRight(left0, right1);
        assertEquals(right1, findSuccessor.findSuccessor(left0));
    }

    @Test
    void findSuccessor2() {
        //skewed left tree
        TreeNode.linkLeft(root, left0);
        TreeNode.linkLeft(left0, left1);
        TreeNode.linkLeft(left1, right1);
        TreeNode.linkLeft(right1, right0);
        assertEquals(root, findSuccessor.findSuccessor(left0));

    }
}