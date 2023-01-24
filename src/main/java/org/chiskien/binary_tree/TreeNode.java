package org.chiskien.binary_tree;

public class TreeNode<T> {
    private TreeNode<T> leftChild;
    private TreeNode<T> rightChild;
    private T data;

    public TreeNode() {
        leftChild = rightChild = null;
    }

    public TreeNode(T data) {
        leftChild = rightChild = null;
        this.data = data;
    }
}
