package chiskien.datastructures_algorithms.heap.implementations;

public class HeapNode<K, V> {


    private K key;
    private V value;

    public HeapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
