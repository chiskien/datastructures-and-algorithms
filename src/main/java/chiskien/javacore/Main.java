package chiskien.javacore;

public class Main {
    public static void main(String[] args) {
        int[][] board = new int[][]{{1, 2, 3, 4}, {4, 3, 2, 1}};
        char[][] board2 = new char[][]{{'1', '2', '3', '4'}, {'4', '3', '2', '1'}};

        System.out.println(board[0][1]);
        char b = (char) board[0][1];
    }
}
