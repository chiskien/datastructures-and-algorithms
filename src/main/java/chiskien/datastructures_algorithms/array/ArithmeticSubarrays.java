package chiskien.datastructures_algorithms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ArithmeticSubarrays {
    public static void main(String[] args) {
        int[] ar = new int[]{1, 5, 1, 4, 16, 1, 5};
        checkArithmeticSubArray(ar, new int[]{0, 0, 2}, new int[]{2, 3, 6});
    }

    public static List<Boolean> checkArithmeticSubArray(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i <= l.length; i++) {
            int[] temp = Arrays.copyOf(nums, nums.length);
            Arrays.sort(temp, l[i], r[i]);
            System.s.println(Arrays.toString(temp));
        }
        return result;
    }
}
