package org.chiskien.EPI.binary_tree;

public class TreeNode<T> {
    private TreeNode<T> leftChild;
    private TreeNode<T> rightChild;
    private T data;

    public TreeNode(T data) {
        this.leftChild = this.rightChild = null;
        this.data = data;
    }

    public TreeNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "[" + data + "]";
    }
}
