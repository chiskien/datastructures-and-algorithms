package org.chiskien.datastructures_algorithms.leetcode.hashmap.implementations;

import java.util.Arrays;
import java.util.Map;

class MapNode {
    MapNode next;
    int key;
    int value;

    public MapNode(int key, int value, MapNode next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public MapNode(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public MapNode() {
        this.key = this.value = -1;
        next = null;
    }
}

public class MyHashMap {

    MapNode[] objects = new MapNode[1000];
    public static final double LOAD_FACTOR = 1.5f;

    public MyHashMap() {
        Arrays.fill(objects, new MapNode());
    }

    private int hash(int key) {
        return key % objects.length;
    }

    public void put(int key, int value) {
        MapNode current = objects[hash(key)];
        while (current.next != null) {
            if (current.next.key == key) {
                current.next.value = value;
                return;
            }
            current = current.next;
        }
        current.next = new MapNode(key, value);
    }

    public int get(int key) {
        MapNode current = objects[hash(key)];
        while (current.next != null) {
            if (current.next.key == key) {
                return current.next.value;
            }
            current = current.next;
        }
        return -1;
    }

    public void remove(int key) {
        MapNode current = objects[hash(key)];
        while (current != null && current.next != null) {
            if (current.next.key == key) {
                current.next = current.next.next; //unlink node
                return;
            }
            current = current.next;
        }
    }

    public void resize(int k) {

    }


}
