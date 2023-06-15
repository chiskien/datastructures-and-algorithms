package org.chiskien.EPI.array;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class InsertDeleteGetRandom {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        Random random = new Random();
        Object[] arr = set.toArray();
        int randomValue = (int) arr[random.nextInt(arr.length)];
        System.out.println(randomValue);

    }
}
