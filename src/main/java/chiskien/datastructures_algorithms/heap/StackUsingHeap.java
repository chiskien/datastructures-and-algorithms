package chiskien.datastructures_algorithms.heap;

import java.util.Comparator;

public class StackUsingHeap {


    private final int DEFAULT_INITIAL_CAPACITY = 16;

    private class ValueWithRank {
        public Integer value;
        public Integer rank;

        public ValueWithRank(Integer value, Integer rank) {
            this.value = value;
            this.rank = rank;
        }
    }

    private class ValueRankComparator implements Comparator<ValueWithRank> {

        @Override
        public int compare(ValueWithRank o1, ValueWithRank o2) {
            return 0;
        }
    }
}
