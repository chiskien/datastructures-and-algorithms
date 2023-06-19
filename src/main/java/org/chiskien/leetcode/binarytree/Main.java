package org.chiskien.leetcode.binarytree;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.setRoot(new TreeNode<>(50));
        List<Integer> test = List.of(25, 75, 13, 38, 62, 88);
        binaryTree.addRange(test);
        binaryTree.inorderTraversal(binaryTree.getRoot());


    }
}
