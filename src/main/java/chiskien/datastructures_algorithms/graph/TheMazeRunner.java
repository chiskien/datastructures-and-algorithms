package chiskien.datastructures_algorithms.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TheMazeRunner {

    public enum Color {WHITE, BLACK}

    public static class Coordinate {
        public int x;
        public int y;

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


    public static List<Coordinate> searchMaze(int[][] maze,
                                              Coordinate start,
                                              Coordinate end) {

        List<Coordinate> path = new ArrayList<>();
        maze[start.x][start.y] = Color.BLACK.ordinal();
        path.add(start);
        if (!searchMazeHelper(maze, start, end, path)) {
            path.remove(path.size() - 1);
        }
        return path;
    }
    //Perform Depth First Search to find a feasible path

    private static boolean searchMazeHelper(int[][] maze,
                                            Coordinate currentLocation,
                                            Coordinate endLocation,
                                            List<Coordinate> path) {
        if (currentLocation.equals(endLocation)) {
            return true;

        }
        final int[][] SHIFTS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (int[] movement : SHIFTS) {
            Coordinate nextStep = new Coordinate(currentLocation.x + movement[0],
                    currentLocation.y + movement[1]);
            if (isFeasible(nextStep, maze)) {
                maze[nextStep.x][nextStep.y] = Color.BLACK.ordinal();
                path.add(nextStep);
                if (searchMazeHelper(maze, nextStep, endLocation, path)) {
                    return true;
                }
                path.remove(path.size() - 1);
            }
        }
        return false;
    }


}
