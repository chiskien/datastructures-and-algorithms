package org.chiskien.linked_list;

public class DoublyNode<T> {
    private DoublyNode<T> previous;
    private DoublyNode<T> next;
    private T data;

    public DoublyNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyNode<T> previous) {
        this.previous = previous;
    }

    public DoublyNode<T> getNext() {
        return next;
    }

    public void setNext(DoublyNode<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoublyNode(T data) {
        this.previous = null;
        this.next = null;
        this.data = data;
    }
}
