package org.chiskien.datastructures_algorithms.leetcode.linked_list;


import java.util.HashMap;
import java.util.Map;

 class CacheNode {
    int key;
    int value;
    CacheNode prev;
    CacheNode next;
}

public class LRUCache2 {

    int capacity;
    int size;
    Map<Integer, CacheNode> table;
    CacheNode dummyHead;
    CacheNode dummyTail;

    public LRUCache2(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        table = new HashMap<>();
        dummyHead = new CacheNode();
        dummyTail = new CacheNode();

        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }

    public int get(int key) {
        CacheNode node = table.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    private void moveToHead(CacheNode node) {
    }

    private void removeCacheNode(CacheNode node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

}
