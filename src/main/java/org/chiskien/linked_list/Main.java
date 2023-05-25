package org.chiskien.linked_list;

import java.util.Deque;
import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Node<Integer> head = new Node<>(12);
        list.setHead(head);
        list.addToTail(266);
        Node<Integer> newNode = new Node<>(12);
        list.addToTail(newNode);
        list.removeDuplicateNode(head);
        System.out.println(list);
    }
}
