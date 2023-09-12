package org.chiskien.datastructures.codility;

public class Task1 {

    public static int solution(int[] A) {
        int i = 0;
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(A[0]);
        while (i <= A.length) {
            if (A[i] == -1) {
                linkedList.addToTail(new Node(A[i]));
                break;
            } else {
                Node newNode = new Node(A[A[i]]);
                linkedList.addToTail(newNode);
            }
            i++;
        }
        return linkedList.getSize();
    }
}

class Node {
    public Node next;
    public int data;

    public Node(int data) {
        this.next = null;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + '}';
    }
}

class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public LinkedList() {
        this.head = this.tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void addToTail(Node newNode) {
        if (isEmpty()) {
            head = tail = newNode;
        } else if (head.next == null) {
            head.next = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int getSize() {
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (isEmpty()) {
            stringBuilder.append("List is empty");
        } else {
            Node n = head;
            while (n != null) {
                stringBuilder.append(n.data).append("-->");
                n = n.next;
            }
            stringBuilder.append("end");
        }
        return stringBuilder.toString();
    }
}
