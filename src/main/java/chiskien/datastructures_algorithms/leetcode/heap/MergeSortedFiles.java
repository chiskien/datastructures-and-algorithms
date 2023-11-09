package chiskien.datastructures_algorithms.leetcode.heap;

import java.util.*;

public class MergeSortedFiles {


    //Given 500 sortedArrays, each file contains stock information for an S&P 500 company.
    //A line encodes each trade in the following format: 12311, AAPL, 30, 456.12
    //First number is the time of the trade expressed as the number of milliseconds since the start of the day's trading

    //Write a program that takes as input a set of sorted sequences
    // and computes the union of these sequences as a sorted sequence.
    // For example, if the input is (3,5,7), (0,6), and (0,6, 28), then the output is (0, 0,3,5,6,6,7, 28).


    //Brute-force approach: Merge into 1 array and use Arrays.sort()
    //Time complexity: O(nlogn) (Default quick sort)

    private static class Entry {
        public Integer index;
        public Integer value;

        public Entry(Integer value, Integer index) {
            this.index = index;
            this.value = value;
        }
    }


    public List<Integer> mergeSortedArrays(List<List<Integer>> sortedArrays) {
        List<Iterator<Integer>> iterators = new ArrayList<>(sortedArrays.size());
        for (List<Integer> array : sortedArrays) {
            iterators.add(array.iterator());
        }
        PriorityQueue<Entry> minHeap = new PriorityQueue<>(sortedArrays.size(),
                Comparator.comparingInt(ol -> ol.value));
        for (int i = 0; i < iterators.size(); ++i) {
            if (iterators.get(i).hasNext()) {
                minHeap.add(new Entry(iterators.get(i).next(), i));
            }
        }
        List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            Entry headEntry = minHeap.poll();
            result.add(headEntry.value);
            if (iterators.get(headEntry.index).hasNext()) {
                minHeap.add(new Entry(iterators.get(headEntry.index).next(), headEntry.index));
            }
        }
        return result;
    }
}
