package chiskien.effectivejava.chapter4_generics;

import java.util.Arrays;

public class DemoGenerics {
    public int size;
    public Object[] elements;

    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            @SuppressWarnings("unchecked") //using @suppress on as lowest scope as possible
            T[] result = (T[]) Arrays.copyOf(elements, size, a.getClass());
            return result;
        }
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }
}
