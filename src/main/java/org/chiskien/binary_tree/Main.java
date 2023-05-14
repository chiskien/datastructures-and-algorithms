package org.chiskien.binary_tree;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        TreeNode<Integer> root = new TreeNode<>(50);
        BinaryTree<Integer> binaryTree = new BinaryTree<>(root);
        List<Integer> test = List.of(25, 75, 13, 38, 62, 88);
        binaryTree.addRange(test);
        System.out.println(binaryTree);

    }
}
