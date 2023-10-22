package chiskien.datastructures_algorithms.leetcode.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BuildMatrix {
    private final static String RESOURCES = "src/main/resources/";

    public static int[][] buildMatrix(String fileName, int row, int column, String regex ) throws IOException {
        final Path path = Paths.get(RESOURCES + fileName);
        List<String> lines = Files.readAllLines(path);
        int[][] board = new int[row][column];
        for (int i = 0; i < lines.size(); i++) {
            String s =  lines.get(i);
            String[] col = s.split(regex);
            for (int j = 0; j < col.length; j++) {
                String s1 = col[j];
                board[i][j] = Integer.parseInt(s1);
            }
        }
        return board;
    }
}
