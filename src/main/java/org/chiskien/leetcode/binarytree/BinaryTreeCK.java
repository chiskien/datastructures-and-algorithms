package org.chiskien.leetcode.binarytree;

import java.util.Collection;

public class BinaryTreeCK<T extends Comparable<T>> {

    private TreeNode<T> root;

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    private final TreeNodeComparator<T> treeNodeComparator;


    public BinaryTreeCK() {
        treeNodeComparator = new TreeNodeComparator<>();
    }

    public void addNode(TreeNode<T> newNode) {
        if (root == null) {
            root = newNode;
        } else {
            TreeNode<T> pivot = root;
            while (pivot != null) {
                if (treeNodeComparator.compare(newNode.getData(), pivot.getData()) >= 0) {
                    if (pivot.getRightChild() == null) {
                        pivot.setRightChild(newNode);
                        return;
                    } else {
                        pivot = pivot.getRightChild();
                    }
                } else {
                    if (pivot.getLeftChild() == null) {
                        pivot.setLeftChild(newNode);
                        break;
                    } else {
                        pivot = pivot.getLeftChild();
                    }
                }
            }
        }
    }

    public void addNode(T data) {
        TreeNode<T> newNode = new TreeNode<>(data);
        addNode(newNode);
    }

    public void inorderTraversal(TreeNode<T> root) {
        if (root == null) return;
        inorderTraversal(root.getLeftChild());
        System.out.println(root.getData() + " ");
        inorderTraversal(root.getRightChild());
    }

    public void postOrder(TreeNode<T> root) {
        if (root == null) return;
        postOrder(root.getLeftChild());
        System.out.println(root.getData() + " ");
        postOrder(root.getRightChild());
    }

    public void preOrder(TreeNode<T> root) {
        if (root == null) return;
        preOrder(root.getLeftChild());
        System.out.println(root.getData() + " ");
        preOrder(root.getRightChild());
    }

    public TreeNode<T> search(T data) {
        if (isEmpty()) {
            return null;
        } else {
            TreeNode<T> pivot = root;
            while (pivot != null && !data.equals(pivot.getData())) {
                if (treeNodeComparator.compare(data, pivot.getData()) >= 0) {
                    pivot = pivot.getRightChild();
                } else {
                    pivot = pivot.getLeftChild();
                }
            }
            return pivot;
        }
    }

    public void deleteNode(TreeNode<T> node) {
        TreeNode<T> parent = getSuccessor(node);
        //case the node delete is leaf (doesnot have children)
        if (node.getRightChild() == null && node.getLeftChild() == null) {
            if (parent.getLeftChild() == node) {
                parent.setLeftChild(null);
            } else {
                parent.setRightChild(null);
            }
        } else if (node.getRightChild() != null && node.getLeftChild() == null) {

        } else if (node.getRightChild() == null && node.getLeftChild() != null) {

        } else {

        }
    }

    public void addRange(Collection<T> data) {
        for (T i : data) {
            addNode(i);
        }
    }

    public TreeNode<T> getSuccessor(TreeNode<T> node) {
        TreeNode<T> pivot = root;
        TreeNode<T> parent = null;
        while (pivot != null && !node.getData().equals(pivot.getData())) {
            parent = pivot;
            if (treeNodeComparator.compare(node.getData(), pivot.getData()) >= 0) {
                pivot = pivot.getRightChild();
            } else {
                pivot = pivot.getLeftChild();
            }
        }
        return parent;
    }

    public boolean isEmpty() {
        return (root == null);
    }
}
