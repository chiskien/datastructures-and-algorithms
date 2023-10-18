package chiskien.datastructures_algorithms.leetcode.linked_list;


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

    public void put(int key, int newValue) {
        CacheNode node = table.get(key);
        if (node == null) {
            CacheNode newNode = new CacheNode();
            newNode.key = key;
            newNode.value = newValue;
            table.put(key, newNode);
            addNodeToHead(newNode);
            ++size;

            //evict least recently used item if current size is > capacity
            if (size > capacity) {
                CacheNode tail = removeTail();
                table.remove(tail.key);
                --size;
            }
        }
    }

    private CacheNode removeTail() {
        CacheNode tail = dummyTail.prev;
        removeCacheNode(tail);
        return tail;
    }

    private void addNodeToHead(CacheNode node) {
        node.next = dummyHead.next;
        node.prev = dummyHead;
    }

    private void moveToHead(CacheNode node) {
        removeCacheNode(node);
        addNodeToHead(node);
    }

    private void removeCacheNode(CacheNode node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

}
