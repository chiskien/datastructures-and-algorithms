package org.chiskien.datastructures_algorithms.leetcode.heap;

import java.util.*;

public class KWeakestRow {
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 1, 0, 0}, {1, 1, 1, 1, 1}, {1, 0, 0, 0, 0}};
        kWeakestRow(mat, 2);
    }


    public static void kWeakestRow(int[][] mat, int k) {
        Map<Integer, Integer> mapRowWithItsCount = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            int[] row = mat[i];
            int j = 0; //iterate through row
            int count = 0; //count number of soldiers
            while (j < row.length) {
                if (row[j] == 1) count++;
                j++;
            }
            mapRowWithItsCount.put(i, count);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(
                (o1, o2) -> o2.getValue().compareTo(o1.getValue()) //min heap
        );
        priorityQueue.addAll(mapRowWithItsCount.entrySet());
        if (priorityQueue.size() > k) {
            priorityQueue.poll();
        }
        System.out.println(priorityQueue);
    }

}
