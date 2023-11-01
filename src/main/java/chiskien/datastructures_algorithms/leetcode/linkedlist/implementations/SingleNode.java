package chiskien.datastructures_algorithms.leetcode.linkedlist.implementations;

class SingleNode<T> {
    private SingleNode<T> next;
    private T data;

    public SingleNode(T data) {
        this.next = null;
        this.data = data;
    }

    public SingleNode<T> getNext() {
        return next;
    }

    public void setNext(SingleNode<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node with data: " + data;
    }
}
