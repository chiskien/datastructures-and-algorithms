package chiskien.datastructures_algorithms.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Problem from Elements of Programming Interview with Java using Graph DFS
 *
 * @author chisk
 * @since  21
 * @since 2023
 */
public class TheMazeRunner {

    public enum Color {WHITE, BLACK}

    public static class Coordinate {
        int x;
        int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Coordinate that = (Coordinate) obj;
            return this.x == that.x && this.y == that.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    /**
     * @param maze  the input matrix
     * @param start Coordinate of starting position which denote in {@link Coordinate} class
     * @param end   Coordinate of final position to escape the matrix which denoted in {@link Coordinate} class
     * @return List of Coordinate represent a path containing every step from starting position to final destination
     */

    public static List<Coordinate> searchMaze(int[][] maze, Coordinate start, Coordinate end) {

        List<Coordinate> path = new ArrayList<>();
        maze[start.x][start.y] = Color.BLACK.ordinal();
        path.add(start);
        if (!searchMazeHelper(maze, start, end, path)) {
            path.removeLast();
        }
        return path;
    }

    /**
     * Perform Depth First Search to find a feasible path
     */
    private static boolean searchMazeHelper(int[][] maze,
                                            Coordinate currentLocation,
                                            Coordinate endLocation,
                                            List<Coordinate> path) {
        if (currentLocation.equals(endLocation)) {
            return true;
        }
        final int[][] shifts = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (int[] movement : shifts) {
            Coordinate nextStep = new Coordinate(currentLocation.x + movement[0],
                    currentLocation.y + movement[1]);
            if (isFeasible(nextStep, maze)) {
                maze[nextStep.x][nextStep.y] = Color.BLACK.ordinal();
                path.add(nextStep);
                if (searchMazeHelper(maze, nextStep, endLocation, path)) {
                    return true;
                }
                path.removeLast();
            }
        }
        return false;
    }

    private static boolean isFeasible(Coordinate current, int[][] maze) {
        return current.x >= 0 && current.x < maze.length && current.y >= 0
                && current.y < maze[current.x].length
                && maze[current.x][current.y] == Color.WHITE.ordinal();
    }
}
