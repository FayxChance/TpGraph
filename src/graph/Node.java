package graph;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Node {
    private String prefixe;
    private String name;

    Map<Node, String> adjacentNodes = new HashMap<>();

    public void addDestination(Node destination, String relation) {
        adjacentNodes.put(destination, relation);
    }

    public Node(String name,String prefixe) {
        this.name = name;
    }

    // getters and setters
}