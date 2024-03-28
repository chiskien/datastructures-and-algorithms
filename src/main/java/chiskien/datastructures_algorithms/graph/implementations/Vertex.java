package chiskien.datastructures_algorithms.graph.implementations;


/**
 * In graph data structure, we represent nodes as vertices
 * @author chisk
 * @since 28/3/2024
 * @apiNote New edition
 */
public class Vertex<T> {

    public T label; //this can be any data object so i use generic here
    public boolean wasVisited;

    public Vertex(T label) {
        this.wasVisited = false;
        this.label = label;
    }
}
