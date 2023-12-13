package chiskien.datastructures_algorithms.graph;

import java.util.*;

public class CloneGraph {

    public GraphVertex cloneGraph(GraphVertex node) {
        if (node == null) return null;

        Map<GraphVertex, GraphVertex> vertextMap = new HashMap<>();
        Queue<GraphVertex> queue = new LinkedList<>();
        queue.add(node);
        vertextMap.put(node, new GraphVertex(node.val));
        while (!queue.isEmpty()) {
            GraphVertex v = queue.remove();
            for (GraphVertex n : v.neighbors) {
                //Try to copy node n
                if (!vertextMap.containsKey(n)) {
                    vertextMap.put(n, new GraphVertex(n.val));
                    queue.add(n);
                }
                //copy edge
                vertextMap.get(v).neighbors.add(vertextMap.get(n));
            }
        }
        return vertextMap.get(node);
    }

    public static class GraphVertex {
        public int val;
        public List<GraphVertex> neighbors;

        public GraphVertex(int val) {
            this.val = val;
            this.neighbors = new ArrayList<>();
        }


    }
}

