package chiskien.datastructures_algorithms.graph;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class GraphCK {

    private final int MAX_VERTICES = 20;
    private Vertex[] verticesList; //array of vertices
    private int[][] adjacencyMatrix; //represent the connectivity between Vertices
    private int size; //current number of vertices

    public GraphCK() {
        verticesList = new Vertex[MAX_VERTICES];
        adjacencyMatrix = new int[MAX_VERTICES][MAX_VERTICES];
        size = 0;
        for (int i = 0; i < MAX_VERTICES; i++) { //construct adjacencyMatrix
            for (int j = 0; j < MAX_VERTICES; j++) {
                adjacencyMatrix[i][j] = 0;
            }
        }
    }

    public void addVertex(char label) {
        verticesList[size++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        adjacencyMatrix[start][end] = 1;
        adjacencyMatrix[end][start] = 1;
    }

    public int getAdjacentUnvisitedVertex(int v) {
        for (int i = 0; i < size; i++) {
            if (adjacencyMatrix[v][i] == 1 && !verticesList[i].isVisited) {
                return i; //return first such vertex
            }
        }
        return -1; //no such vertices
    }

    public void dfs() {
        Deque<Integer> stack = new LinkedList<>();
        verticesList[0].isVisited = true; //begin at index 0 and mark it true
        displayVertex(0);
        stack.push(0);
        while (!stack.isEmpty()) {
            //get an unvisited vertex adjacent to the top of stack
            int i = getAdjacentUnvisitedVertex(stack.peek());
            if (i == -1) {
                stack.pop();
            } else {
                verticesList[i].isVisited = true;
                displayVertex(i);
                stack.push(i);
            }
        }
        for (int i = 0; i < size; i++) { //reset flag
            verticesList[i].isVisited = false;
        }
    }

    public void displayVertex(int i) {
        System.out.println(verticesList[i].label);
    }
}
