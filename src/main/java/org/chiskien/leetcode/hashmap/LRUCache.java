package org.chiskien.leetcode.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {


    /* ISBN (International Standard Book Number) is a unique commercial book identifier
       - The First 9 is digits and the last is a check character
     */

    // A Cache for lookup, insert, and remove methods.
    // Using LRU eviction
    LinkedHashMap<Integer, Integer> isbnToPrice;

    public LRUCache(int capacity) {
        this.isbnToPrice =
                new LinkedHashMap<>(capacity, 1.0f, true) {
                    @Override
                    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                        return this.size() > capacity;
                    }
                };
    }

    public Integer lookup(Integer key) {
        if (!isbnToPrice.containsKey(key)) {
            return -1;
        }
        return isbnToPrice.get(key);
    }

    //
    public Integer insert(Integer key, Integer value) {
        Integer currentValue = isbnToPrice.get(key);
        if (!isbnToPrice.containsKey(key)) {
            isbnToPrice.put(key, value);
            return currentValue;
        } else {
            return -1;
        }
    }

    //if not containsKey then insert
    public void put(Integer key, Integer value) {
        if (!isbnToPrice.containsKey(key)) {
            isbnToPrice.put(key, value);
        } else {
            Integer currentValue = isbnToPrice.get(key);
            isbnToPrice.replace(key, currentValue, value);
        }
    }

    public Integer remove(Object key) {
        return isbnToPrice.remove((Integer) key);
    }
}
