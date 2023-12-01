package kozy;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    //Bài 3: Cho một ma trận MxN  mỗi một ô có một số hạt thóc,
    // Nhập vào số bước đi X và ô bắt đầu,
    // hãy tìm đường đi để có thể nhặt được nhiều hạt thóc nhất
    // sau X bước
    //
    //
    //5    3     6
    //4   10     9
    //2    0      8
    //1    5      7

    public List<int[]> path(int[][] matrix, int[] point) {
        int[][] shifts = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        List<int[]> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int size = 0;
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
//            for (int col = 0; col < shifts.length; col++) {
//                point[row] = matrix[point][]
//                sum += point[row][col];
//                max = Math.max(sum, max);
//                result.add(point);
//            }
        }
        return result;
    }


}
