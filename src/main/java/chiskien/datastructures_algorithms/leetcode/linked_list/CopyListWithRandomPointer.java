package chiskien.datastructures_algorithms.leetcode.linked_list;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

    public Node copyRandomList(Node head) {
        Map<Node, Node> newToOriginal = new HashMap<>();
        Node current = head;
        while (current != null) {
            Node newNode = new Node(current.val); //create a deep copy node
            newToOriginal.put(current, newNode); //map new to original
            current = current.next;
        }

        current = head;
        while (current != null) {
            Node newNode = newToOriginal.get(current);
            newNode.next = newToOriginal.get(current.next);
            newNode.random = newToOriginal.get(current.random);
            current = current.next;
        }

        return newToOriginal.get(head);
    }

}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        next = random = null;
    }

    public Node() {
    }
}