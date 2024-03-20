package chiskien.effectivejava.chapter1_objectslifecycle.item7;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.SortedMap;
import java.util.TreeMap;

//This code produces Memory Leaks
class StackCK {

    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;
    private static final int GROWTH_FACTOR = 2;

    StackCK() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    void push(Object element) {
        ensureCapacity();
        elements[size++] = element;
    }

    Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        elements[size] = null;
        return elements[--size];
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, elements.length * GROWTH_FACTOR + 1);
        }
    }


}
