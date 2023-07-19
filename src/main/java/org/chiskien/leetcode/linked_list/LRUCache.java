package org.chiskien.leetcode.linked_list;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    LinkedHashMap<Integer, Integer> linkedHashMap;

    public LRUCache(int capacity) {

        this.linkedHashMap = new LinkedHashMap<>(capacity, 1.0f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> e) {
                return this.size() > capacity;
            }
        };
    }

    public int get(int key) {
        return lookup(key);
    }

    private int lookup(Integer key) {
        if (!linkedHashMap.containsKey(key)) {
            return -1;
        }
        return linkedHashMap.get(key);
    }

    //Update the value of the key if the key exists.
    // Otherwise, add the key-value pair to the cache.
    // If the number of keys exceeds the capacity from this operation,
    // evict the least recently used key.
    public void put(int key, int value) {
        insert(key, value);
    }

    private Integer insert(Integer key, Integer value) {
        Integer currentValue = linkedHashMap.get(key);
        if (!linkedHashMap.containsKey(key)) {
            linkedHashMap.put(key, value);
            return currentValue;
        } else {
            return null;
        }
    }
}

