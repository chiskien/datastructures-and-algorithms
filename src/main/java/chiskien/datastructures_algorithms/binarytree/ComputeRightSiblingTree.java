package chiskien.datastructures_algorithms.binarytree;


public class ComputeRightSiblingTree {


    //Write a program that takes a perfect binary tree, and sets each node's level-next field to the node on its right, if one exists.
    public Node connect(Node root) {
        Node leftStart = root;
        while (leftStart != null && leftStart.left != null) {
            populateLowerLevelNextField(leftStart);
            leftStart = leftStart.left;
        }
        return root;
    }

    private void populateLowerLevelNextField(Node startNode) {
        Node iter = startNode;
        while (iter != null) {
            iter.left.next = iter.right;
            if (iter.next != null) {
                iter.right.next = iter.next.left;
            }
            iter = iter.next;
        }
    }
    //Assume that each binary tree node has an extra field, call it next-level
    //the level-next field will be used to compute a map from nodes to their right siblings

    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node(int val) {
            this.val = val;
            this.left = this.right = this.next = null;
        }

        public Node(int val, Node left, Node right, Node next) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.next = next;
        }
    }

}

