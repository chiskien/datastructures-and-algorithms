package chiskien.datastructures_algorithms.leetcode.linkedlist;

class MyLinkedList {
    public static void main(String[] args) {
        MyLinkedList mll = new MyLinkedList();
        mll.addAtHead(4);
        System.out.println(mll.get(1));
        System.out.println(mll.head);
    }

    MyNode head, tail;
    int size;

    public MyLinkedList() {
        this.head = this.tail = null;
        this.size = 0;
    }

    public void addAtHead(int val) {
        if (head == null) {
            head = tail = new MyNode(val);
        } else {
            MyNode newNode = new MyNode(val);
            newNode.next = head;
            head = newNode;

        }
        size++;
    }

    public void addAtTail(int val) {
        MyNode newNode = new MyNode(val);
        if (head == tail) {
            head.next = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index == size) {
            addAtTail(val);
        } else if (index < size) {
            MyNode newNode = new MyNode(val);
            MyNode current = head;
            MyNode dummyHead = new MyNode(-1, head);
            MyNode previous = dummyHead;
            int i = index;
            while (i-- > 0) {
                current = current.next;
                previous = previous.next;
            }
            previous.next = newNode;
            newNode.next = current;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        MyNode previous = new MyNode(0, head);
        MyNode current = head;
        if (index == 0) {
            head = head.next;
        } else {
            while (index-- > 0) {
                previous = previous.next;
                current = current.next;
            }
            if (current.next == null) {
                tail = previous;
            }
            previous.next = current.next;
        }
        size--;
    }

    public int get(int index) {
        if (index == 0) return head.val;
        if (index == size +1) return tail.val;
        MyNode current = head;
        while (index-- > 0) {
            current = current.next;
        }
        return current.val;
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

    public MyNode(MyNode head) {
        this.next = head;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}