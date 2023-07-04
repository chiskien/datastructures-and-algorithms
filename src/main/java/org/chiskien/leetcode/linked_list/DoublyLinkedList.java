package org.chiskien.leetcode.linked_list;

public class DoublyLinkedList<T> {

    private DoublyNode head;
    private DoublyNode tail;

    public boolean isEmpty() {
        return head == null;
    }

    public

    static class DoublyNode<T> {
        public DoublyNode<T> next;
        public DoublyNode<T> prev;
        public T data;

        public DoublyNode(DoublyNode<T> next, DoublyNode<T> prev, T data) {
            this.next = next;
            this.prev = prev;
            this.data = data;
        }

        public DoublyNode() {
        }
    }

}

