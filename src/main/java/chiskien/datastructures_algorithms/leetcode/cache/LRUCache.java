package chiskien.datastructures_algorithms.leetcode.cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

    // A Cache for lookup, insert, and remove methods.
    // Using LRU eviction
    LinkedHashMap<Integer, Integer> linkedHashMap;

    public LRUCache(int capacity) {
        this.linkedHashMap =
                new LinkedHashMap<>(capacity, 1.0f, true) {
                    @Override
                    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> leastEntry) {
                        return this.size() > capacity;
                    }
                };
    }

    public Integer lookup(Integer key) {
        if (!linkedHashMap.containsKey(key)) {
            return -1;
        }
        return linkedHashMap.get(key);
    }

    //
    public Integer insert(Integer key, Integer value) {
        Integer currentValue = linkedHashMap.get(key);
        if (!linkedHashMap.containsKey(key)) {
            linkedHashMap.put(key, value);
            return currentValue;
        } else {
            return -1;
        }
    }

    //if not containsKey then insert
    public void put(Integer key, Integer value) {
        if (!linkedHashMap.containsKey(key)) {
            linkedHashMap.put(key, value);
        } else {
            Integer currentValue = linkedHashMap.get(key);
            linkedHashMap.replace(key, currentValue, value);
        }
    }

    public Integer remove(Object key) {
        return linkedHashMap.remove((Integer) key);
    }
}
