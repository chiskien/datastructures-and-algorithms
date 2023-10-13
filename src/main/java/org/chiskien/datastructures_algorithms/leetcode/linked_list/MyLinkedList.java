package org.chiskien.datastructures_algorithms.leetcode.linked_list;

class MyLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);
        System.out.println(myLinkedList.head);
        System.out.println(myLinkedList.get(1));
        myLinkedList.deleteAtIndex(1);
        System.out.println(myLinkedList.get(1));
    }

    MyNode head;
    MyNode tail;
    int size;

    public boolean isEmpty() {
        return (head == null);
    }

    public void addAtHead(int val) {
        if (isEmpty()) {
            head = tail = new MyNode(val);
        } else {
            MyNode current = new MyNode(val);
            current.next = head;
            head = current;
        }
        size++;
    }

    public void addAtTail(int val) {
        if (isEmpty()) {
            head = tail = new MyNode(val);
        } else {
            MyNode current = new MyNode(val);
            tail.next = current;
            tail = current;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index == size) {
            addAtTail(val);
        } else if (index == 0) {
            addAtHead(val);
        } else if (index < size) {
            MyNode current = head;
            while (index-- > 1) {
                current = current.next;
            }
            MyNode newNode = new MyNode(val);
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    public int get(int index) {
        if (!isEmpty()) {
            if (index == 0) return head.val;
            if (index == size) return tail.val;
            if (index < size) {
                MyNode current = head;
                while (index-- > 0) {
                    current = current.next;
                }
                return current.val;
            }
        }
        return -1;
    }

    public void deleteAtIndex(int index) {
        if (!isEmpty()) {
            if (index == size) {
                MyNode prev = new MyNode(0, head);
                MyNode n = head;
                while (n.next != null) {
                    n = n.next;
                    prev = prev.next;
                }
                prev.next = null;
                tail = prev;
                size--;

            } else if (index == 0) {
                deleteHead();
            } else {
                MyNode previous = head;
                while (index-- > 1) {
                    previous = previous.next;
                }
                previous.next = previous.next.next;
                size--;
            }
        }
    }

    public void deleteHead() {
        if (!isEmpty()) {
            head = head.next;
            size--;
        }
    }

}

class MyNode {
    MyNode next;
    int val;

    public MyNode(int val) {
        this.next = null;
        this.val = val;
    }

    public MyNode(int val, MyNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}