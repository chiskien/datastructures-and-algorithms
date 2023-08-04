package org.chiskien.leetcode.binarytree;

import java.util.Collection;

public class BinarySearchTreeCK<T extends Comparable<T>> {

    private TreeNode<T> root;

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    private final TreeNodeComparator<T> treeNodeComparator;


    public BinarySearchTreeCK() {
        treeNodeComparator = new TreeNodeComparator<>();
    }

    private boolean addNode(TreeNode<T> newNode) {
        if (root == null) {
            root = newNode;
        } else {
            TreeNode<T> current = root;
            TreeNode<T> parent = current;
            while (current != null) {
                parent = current;
                int compare = treeNodeComparator.compare(newNode.data, current.data);
                if (compare == 0) {
                    return false;
                } else if (compare < 0) {
                    current = current.leftChild;
                } else {
                    current = current.rightChild;
                }
            }
            if (treeNodeComparator.compare(newNode.data, parent.data) < 0) {
                parent.leftChild = newNode;
            } else {
                parent.rightChild = newNode;
            }
        }
        return true;
    }

    public boolean delete(T key) {
        TreeNode<T> current = root;
        TreeNode<T> parrent = null;
        while (current != null && treeNodeComparator.compare(current.data, key) != 0) {
            parrent = current;
            current = treeNodeComparator.compare(key, current.data) < 0 ? current.leftChild : current.rightChild;
        }
        if (current == null) {
            return false; //no node with key
        }
        TreeNode<T> keyNode = current;
        if (keyNode.rightChild != null) {
            TreeNode<T> rKeyNode = keyNode.rightChild;
            TreeNode<T> rParent = keyNode;
            while (rKeyNode.leftChild != null) {
                rParent = rKeyNode;
                rKeyNode = rKeyNode.leftChild;
            }
            keyNode.data = rKeyNode.data;
            if (rParent.leftChild == rKeyNode) {
                rParent.leftChild = rKeyNode.rightChild;
            } else {
                rParent.rightChild = rKeyNode.leftChild;
            }
            rKeyNode.rightChild = null;
        } else {
            if (root == keyNode) {
                root = keyNode.leftChild;
            } else {
                if (parrent.leftChild == keyNode) {
                    parrent.leftChild = keyNode.leftChild;
                } else {
                    parrent.rightChild = keyNode.leftChild;
                }
            }
            keyNode.leftChild = null;
        }
        return true;
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

    static class TreeNode<T> {
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
}
