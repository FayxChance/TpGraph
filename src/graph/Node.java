package graph;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Node {
    private String prefixe;
    private String name;
    private int id;
    Map<String, List<Node>> adjacentNodes = new HashMap<String, List<Node>>();

    public void addDestination(Node destination, String relation) {
        if (adjacentNodes.get(relation)==null)
            adjacentNodes.put(relation, new ArrayList<Node>());
        adjacentNodes.get(relation).add(destination);
    }

    public Node(String name,String prefixe) {
        this(name,prefixe,-1);
    }
    public Node(String name,String prefixe,int id) {
        this.name = name;
        this.prefixe=prefixe;
        this.id=id;
    }

    public String getPrefixe() {
        return prefixe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String, List<Node>> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setAdjacentNodes(Map<String, List<Node>> adjacentNodes) {
        this.adjacentNodes = adjacentNodes;
    }

    public void setPrefixe(String prefixe) {
        this.prefixe = prefixe;
    }

    public boolean isAdjacent(String prefixe, String name){
        boolean res=false;
        if (adjacentNodes.get(prefixe)!=null){

        }
        return res;
    }
}