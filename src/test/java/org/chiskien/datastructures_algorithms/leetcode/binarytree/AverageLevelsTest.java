package org.chiskien.datastructures_algorithms.leetcode.binarytree;

import org.chiskien.datastructures_algorithms.leetcode.binarytree.AverageLevels;
import org.chiskien.datastructures_algorithms.leetcode.binarytree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageLevelsTest {
    AverageLevels averageLevels;
    TreeNode helper;

    @BeforeEach
    void setUp() {
        averageLevels = new AverageLevels();
        helper = new TreeNode();
    }

    @Test
    void averageOfLevels() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
        List<Double> result = averageLevels.averageOfLevels(root);
        List<Double> expected = List.of(3.000, 14.5000, 11.000);
        assertEquals(result, expected);
    }

    @Test
    void averageOfLevels2() {
        TreeNode root = new TreeNode(2147483647);
        root.left = new TreeNode(2147483647);
        root.right = new TreeNode(2147483647);
        List<Double> result = averageLevels.averageOfLevels(root);
        List<Double> expected = List.of(2147483647.000, 2147483647.00);
        assertEquals(result, expected);
    }
}