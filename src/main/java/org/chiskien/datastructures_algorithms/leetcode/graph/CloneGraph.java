package org.chiskien.datastructures_algorithms.leetcode.graph;

import java.util.*;

public class CloneGraph {

    public Node cloneGraph(Node g) {
        if (g == null) return null;

        Map<Node, Node> vertextMap = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(g);
        vertextMap.put(g, new Node(g.val));
        while (!queue.isEmpty()) {
            Node v = queue.remove();
            for (Node n : v.neighbors) {
                //Try to copy node n
                if (!vertextMap.containsKey(n)) {
                    vertextMap.put(n, new Node(n.val));
                    queue.add(n);
                }

                //copy edge
                vertextMap.get(v).neighbors.add(vertextMap.get(n));
            }
        }
        return vertextMap.get(g);
    }
}

class Node {
    public int val;
    public List<Node> neighbors;

    public Node(int val) {
        this.val = val;
        this.neighbors = new ArrayList<>();
    }


}
