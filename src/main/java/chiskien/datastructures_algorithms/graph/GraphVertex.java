package chiskien.datastructures_algorithms.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphVertex {
    public int val;
    public List<GraphVertex> neighbors;

    public GraphVertex(int val) {
        this.val = val;
        this.neighbors = new ArrayList<>();
    }


}
