package chiskien.datastructures_algorithms.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AssignCookies {
    //Time complexity (O(nlogn + mlogm): because we have to sort the array
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        int i = 0;
        int j = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return count;
    }
}
