package org.chiskien.binary_tree;

public class TreeNode<T> {
    private final TreeNode<T> leftChild;
    private final TreeNode<T> rightChild;
    private T data;

    public TreeNode() {
        leftChild = rightChild = null;
    }

}
