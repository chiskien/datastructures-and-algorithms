package chiskien.datastructures_algorithms.graph.implementations;

public class GraphCK<T> {
    private final int MAX_VERTICES = 20;
    private Vertex<T>[] vertexList;
    private final int[][] adjacencyMatrix;
    private int verticesNum;

    @SuppressWarnings("unchecked")
    public GraphCK() {
        vertexList = new Vertex[MAX_VERTICES];
        adjacencyMatrix = new int[MAX_VERTICES][MAX_VERTICES];
        verticesNum = 0;
        for (int i = 0; i < MAX_VERTICES; i++) {
            for (int j = 0; j < MAX_VERTICES; j++) {
                adjacencyMatrix[i][j] = 0;
            }
        }
    }
}
