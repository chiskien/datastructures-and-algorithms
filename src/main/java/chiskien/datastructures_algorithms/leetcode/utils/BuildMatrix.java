package chiskien.datastructures_algorithms.leetcode.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class BuildMatrix {
    private final static String RESOURCES = "src/main/resources/";

    public static int[][] buildMatrix(String fileName) throws IOException {
        final Path path = Paths.get(RESOURCES + fileName);
        List<String> lines = Files.readAllLines(path);
        int[][] board = new int[9][9];
        for (int i = 0; i < lines.size(); i++) {
            String s =  lines.get(i);
            String[] column = s.split(",");
            for (int j = 0; j < column.length; j++) {
                String s1 = column[j];
                board[i][j] = Integer.parseInt(s1);
            }
        }
        return board;
    }
}
