package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Graph {

    private Set<Node> nodes = new HashSet<>();

    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }


    public void rechercheSeeAlso(ArrayList<Node> visited,Node depart, int step, int max){
        if(!dejaPresent(visited,depart) && step <= max){
            visited.add(depart);
            depart.affichePokemon();
            ArrayList<Node> seeAlsoNode=depart.getAdjacentNodes().get("rdfs:seeAlso");
            int nbSeeAlsoNode= seeAlsoNode.size();
            for (int i = 0; i < nbSeeAlsoNode; i++) {
                rechercheSeeAlso(visited,visited.get(i),step+1,max);
            }
        }
        else
            ;
    }
    public boolean dejaPresent(ArrayList<Node> list,Node n){
        return list.contains(n);
    }

    public void rechercheEvolution(Node depart){
        depart.affichePokemon();
        ArrayList<Node> evolutionNode=depart.getAdjacentNodes().get("poke:evolution");
        if(evolutionNode!=null){
            int nbEvolutionNode= evolutionNode.size();

            for (int i = 0; i < nbEvolutionNode; i++) {
                rechercheEvolution(evolutionNode.get(i));
            }
        }
    }
    public void rechercheType(){
        ArrayList<Node> nodeType=new ArrayList<Node>();
        for (Node node : nodes) {
            ArrayList<Node> noeudsPossible=node.getAdjacentNodes().get("skos:broader");
            if(noeudsPossible !=null){
                for (Node nodePossible : noeudsPossible) {
                    if(nodePossible.getAdjacentNodes().get("skos:broader").get(0).getName()=="TypePoke")
                        nodeType.add(nodePossible);
                }
            }
        }
        System.out.println("Voici la liste des types :");
        for (int i = 0; i < nodeType.size(); i++) {
            System.out.println(nodeType.get(i).getName());
        }
    }
}