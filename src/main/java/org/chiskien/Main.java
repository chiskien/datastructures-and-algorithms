package org.chiskien;

import org.chiskien.linked_list.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(2131);
        linkedList.addToHead(22);
        linkedList.addToHead(21141);
        linkedList.addToHead(4363);
        linkedList.traverse();


    }
}