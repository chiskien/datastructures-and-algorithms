package chiskien.datastructures_algorithms.linkedlist.implementations;

class DoublyNode<T> {
    public DoublyNode<T> next;
    public DoublyNode<T> prev;
    public T data;

    public DoublyNode(DoublyNode<T> next, DoublyNode<T> prev, T data) {
        this.next = next;
        this.prev = prev;
        this.data = data;
    }

    public DoublyNode(T data) {
        this.data = data;
        next = prev = null;
    }
}
