package org.chiskien.datastructures_algorithms.leetcode.graph;

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
}
