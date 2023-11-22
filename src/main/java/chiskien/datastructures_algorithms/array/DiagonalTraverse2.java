package chiskien.datastructures_algorithms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalTraverse2 {

    //Given a 2D array, return all elements of nums in diagonal order
    // 1,2,3,4,5
    // 6,7,8,9
    // => return 1 6 2 7 3 8 4 9 5
    public static void main(String[] args) {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2, 3, 4, 5),
                List.of(6, 7),
                List.of(8),
                List.of(9, 10, 11),
                List.of(12, 13, 14, 15, 16));
        System.out.println(Arrays.toString(findDiagonalOrder(matrix)));
    }

    public static int[] findDiagonalOrder(List<List<Integer>> nums) {
        int n = 0;
        int diagonals = 0;
        for (int i = 0; i < nums.size(); i++) {
            n += nums.get(i).size();
            diagonals = Math.max(i + nums.get(i).size(), diagonals);

        }
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < diagonals; i++) {
            buckets.add(new ArrayList<>());

        }

        int bucketIndex = 0;
        for (List<Integer> num : nums) {
            int index = bucketIndex;
            for (Integer i : num) {
                buckets.get(index).add(i);
                index++;
            }
            bucketIndex++;

        }
        int[] diagonalOrder = new int[n];
        int i = 0;
        for (List<Integer> bucket : buckets) {
            for (int j = bucket.size() - 1; j >= 0; j--) {
                diagonalOrder[i] = bucket.get(j);
                i++;
            }

        }


        return diagonalOrder;
    }
}
