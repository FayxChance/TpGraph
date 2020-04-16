package graph;

import in.keyboard.Keyboard;

import java.util.*;

public class Graph {

    private Set<Node> nodes = new HashSet<>();

    public void addNode(Node nodeA) {
        nodes.add(nodeA);
    }


    public void rechercheSeeAlso(Node depart){
        /*if(!dejaPresent(visited,depart)){
            visited.add(depart);

            System.out.println(depart.toString());
            ArrayList<Node> seeAlsoNode=depart.getAdjacentNodes().get("rdfs:seeAlso");
            int nbSeeAlsoNode= seeAlsoNode.size();
            if (step < max) {
                for (int i = 0; i < nbSeeAlsoNode; i++) {
                    rechercheSeeAlso(visited,seeAlsoNode.get(i),step+1,max);
                }
            }
        }*/
        int step=0;
        ArrayList<Node> visited =  new  ArrayList<Node>();
        LinkedList<Node> file=new LinkedList<Node>();
        visited.add(depart);
        file.add(depart);
        while (!file.isEmpty() ){
            depart=file.removeFirst();
            System.out.println(depart.toString());
            ArrayList<Node> seeAlsoNode=depart.getAdjacentNodes().get("rdfs:seeAlso");
            if (seeAlsoNode!=null){
                int nbSeeAlsoNode= seeAlsoNode.size();
                for (int i = 0; i < nbSeeAlsoNode; i++) {
                    if(!visited.contains(seeAlsoNode.get(i))) {
                        file.add(seeAlsoNode.get(i));
                        visited.add(seeAlsoNode.get(i));
                    }
                }
            }

        }
    }
    public boolean dejaPresent(ArrayList<Node> list,Node n){
        return list.contains(n);
    }

    public void rechercheEvolution(Node depart){
        System.out.println(depart.toString());
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
                    if(nodePossible.getName()=="TypePoke")
                        nodeType.add(node);
                }
            }
        }
        System.out.println("Voici la liste des types :");
        for (int i = 0; i < nodeType.size(); i++) {
            System.out.println(nodeType.get(i).getName());
        }
    }
    public ArrayList<Node> recherchePokemon(){
        ArrayList<Node> nodePokemon=new ArrayList<Node>();
        for (Node node : nodes) {
            ArrayList<Node> noeudsPossible=node.getAdjacentNodes().get("rdf:type");
            if(noeudsPossible !=null){
                for (Node nodePossible : noeudsPossible) {
                    if(nodePossible.getName()=="Sauvage" || nodePossible.getName()=="Legendaire" || nodePossible.getName()=="Mega")
                        nodePokemon.add(node);
                }
            }
        }
        return nodePokemon;
    }
    public void afficheListePokemon(){
        ArrayList<Node> list =recherchePokemon();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + " - " + list.get(i).getAdjacentNodes().get("foaf:name").get(0).getName());
        }
    }

    public Node getNodeById(int id ){
        Iterator<Node> i=nodes.iterator();
        while(i.hasNext()){
            Node n=i.next();
            if(n.getId()==id){
                return n;
            }
        }
        return null;
    }
}