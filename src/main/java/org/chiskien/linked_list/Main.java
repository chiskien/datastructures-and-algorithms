package org.chiskien.linked_list;

public class Main {


    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        Node<Integer> head = new Node<>(12);
        list.setHead(head);
        list.addToTail(266);
        Node<Integer> newNode = new Node<>(12);
        list.addToTail(newNode);
        list.removeDuplicateNode(head);
        System.out.println(list);
    }
}
