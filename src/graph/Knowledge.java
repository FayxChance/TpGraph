package graph;

public class Knowledge {
    public static void main(String[] args) {
        Node nodeSalameche = new Node("nodeSalameche",null,1);
        Node nodeDracaufeu = new Node("nodeDracaufeu",null,3);
        Node nodeReptincelle = new Node("nodeReptincelle",null,2);
        Node nodeDracaufeuY = new Node("nodeDracaufeuY",null,4);
        Node nodeDracaufeuX = new Node("nodeDracaufeuX",null,5);
        Node nodeCarapuce = new Node("nodeCarapuce",null,6);
        Node nodeCarabaffe = new Node("nodeCarabaffe",null,7);
        Node nodeTortank = new Node("nodeTortank",null,8);
        Node nodeTortankMega = new Node("nodeMegaTortank",null,9);
        Node nodeMew = new Node("Mew",null,10);

        Node nodeSkosConcept = new Node("Concept","skos");

        Node nodePokePokemon = new Node("Pokemon","poke");
        Node nodePokeSauvage = new Node("Sauvage", "poke");
        Node nodePokeLegendaire = new Node("Legendaire", "poke");
        Node nodePokeTypePoke = new Node("TypePoke","poke");
        Node nodePokeTypePokeFeu = new Node("Feu","poke");
        Node nodePokeTypePokeVol = new Node("Vol","poke");
        Node nodePokeTypePokeEau = new Node("Eau","poke");
        Node nodePokeTypePokeDragon = new Node("Dragon","poke");
        Node nodePokeTypePokePsy = new Node("Psy","poke");

        Node nodeFoafSalamecheName=new Node("Salameche",null);
        Node nodeFoafReptincelleName=new Node("Reptincelle",null);
        Node nodeFoafDracaufeuName=new Node("Dracaufeu",null);
        Node nodeFoafDracaufeuXName=new Node("Méga-Dracaufeu-X",null);
        Node nodeFoafDracaufeuYName=new Node("Méga-Dracaufeu-Y",null);
        Node nodeFoafCarapuceName=new Node("Carapuce",null);
        Node nodeFoafCarabaffeName=new Node("Carabaffe",null);
        Node nodeFoafTortankName=new Node("Tortank",null);
        Node nodeFoafTortankMegaName=new Node("Méga-Tortank",null);
        Node nodeFoafMewName=new Node("Mew",null);

        //Salameche
        nodeSalameche.addDestination(nodeFoafSalamecheName,"foaf:name");
        nodeSalameche.addDestination(nodePokeTypePokeFeu,"rdf:type");
        nodeSalameche.addDestination(nodeReptincelle,"poke:evolution");
        nodeSalameche.addDestination(nodeReptincelle,"rdfs:seeAlso");
        nodeSalameche.addDestination(nodePokeSauvage,"rdf:type");
        nodeSalameche.addDestination(nodeDracaufeu,"rdfs:seeAlso");
        //Reptincelle
        nodeReptincelle.addDestination(nodeFoafReptincelleName,"foaf:name");
        nodeReptincelle.addDestination(nodePokeSauvage,"rdf:type");
        nodeReptincelle.addDestination(nodeDracaufeu,"poke:evolution");
        nodeReptincelle.addDestination(nodeDracaufeu,"rdfs:seeAlso");
        nodeReptincelle.addDestination(nodeSalameche,"rdfs:seeAlso");
        nodeReptincelle.addDestination(nodePokeTypePokeFeu,"rdf:type");
        //Dracaufeu
        nodeDracaufeu.addDestination(nodeFoafDracaufeuName,"foaf:name");
        nodeDracaufeu.addDestination(nodePokeSauvage,"rdf:type");
        nodeDracaufeu.addDestination(nodeReptincelle,"rdfs:seeAlso");
        nodeDracaufeu.addDestination(nodeSalameche,"rdfs:seeAlso");
        nodeDracaufeu.addDestination(nodeDracaufeuX,"rdfs:seeAlso");
        nodeDracaufeu.addDestination(nodeDracaufeuY,"rdfs:seeAlso");
        nodeDracaufeu.addDestination(nodeDracaufeuX,"poke:megaEvolution");
        nodeDracaufeu.addDestination(nodeDracaufeuY,"poke:megaEvolution");
        nodeDracaufeu.addDestination(nodePokeTypePokeFeu,"rdf:type");
        nodeDracaufeu.addDestination(nodePokeTypePokeVol,"rdf:type");
        //DracaufeuY
        nodeDracaufeuY.addDestination(nodeFoafDracaufeuYName,"foaf:name");
        nodeDracaufeuY.addDestination(nodePokeTypePokeFeu,"rdf:type");
        nodeDracaufeuY.addDestination(nodePokeTypePokeVol,"rdf:type");
        nodeDracaufeuY.addDestination(nodeDracaufeu,"rdfs:seeAlso");
        //DracaufeuX
        nodeDracaufeuX.addDestination(nodeFoafDracaufeuXName,"foaf:name");
        nodeDracaufeuX.addDestination(nodePokeTypePokeFeu,"rdf:type");
        nodeDracaufeuX.addDestination(nodePokeTypePokeDragon,"rdf:type");
        nodeDracaufeuX.addDestination(nodeDracaufeu,"rdfs:seeAlso");
        //Carapuce
        nodeCarapuce.addDestination(nodeFoafCarapuceName,"foaf:name");
        nodeCarapuce.addDestination(nodePokeSauvage,"rdf:type");
        nodeCarapuce.addDestination(nodeCarabaffe,"rdfs:seeAlso");
        nodeCarapuce.addDestination(nodeTortank,"rdfs:seeAlso");
        nodeCarapuce.addDestination(nodePokeTypePokeEau,"rdf:type");
        nodeCarapuce.addDestination(nodeCarabaffe,"poke:evolution");

        //Carabaffe
        nodeCarabaffe.addDestination(nodeFoafCarabaffeName,"foaf:name");
        nodeCarabaffe.addDestination(nodePokeSauvage,"rdf:type");
        nodeCarabaffe.addDestination(nodeCarapuce,"rdfs:seeAlso");
        nodeCarabaffe.addDestination(nodeTortank,"rdfs:seeAlso");
        nodeCarabaffe.addDestination(nodePokeTypePokeEau,"rdf:type");
        nodeCarabaffe.addDestination(nodeTortank,"poke:evolution");
        //Tortank
        nodeTortank.addDestination(nodeFoafTortankName,"foaf:name");
        nodeTortank.addDestination(nodePokeSauvage,"rdf:type");
        nodeTortank.addDestination(nodeCarabaffe,"rdfs:seeAlso");
        nodeTortank.addDestination(nodeCarapuce,"rdfs:seeAlso");
        nodeTortank.addDestination(nodeTortankMega,"rdfs:seeAlso");
        nodeTortank.addDestination(nodeTortankMega,"poke:megaEvolution");
        nodeTortank.addDestination(nodePokeTypePokeEau,"rdf:type");
        //Mega-Tortank
        nodeTortankMega.addDestination(nodeFoafTortankMegaName,"foaf:name");
        nodeTortankMega.addDestination(nodeTortank,"rdfs:seeAlso");
        nodeTortankMega.addDestination(nodePokeTypePokeEau,"rdf:type");
        //Mew
        nodeMew.addDestination(nodeFoafMewName,"foaf:name");
        nodeMew.addDestination(nodePokeTypePokePsy,"rdf:type");
        nodeMew.addDestination(nodePokeLegendaire,"rdf:type");
        nodeMew.addDestination(nodeDracaufeu,"rdfs:seeAlso");

        //Type
        nodePokeTypePokeFeu.addDestination(nodePokeTypePoke,"skos:broader");
        nodePokeTypePokeVol.addDestination(nodePokeTypePoke,"skos:broader");
        nodePokeTypePokePsy.addDestination(nodePokeTypePoke,"skos:broader");
        nodePokeTypePokeEau.addDestination(nodePokeTypePoke,"skos:broader");
        nodePokeTypePokeDragon.addDestination(nodePokeTypePoke,"skos:broader");
        nodePokeTypePoke.addDestination(nodeSkosConcept,"rdf:type");
        //Type poké
        nodePokeLegendaire.addDestination(nodePokePokemon,"skos:broader");
        nodePokeSauvage.addDestination(nodePokePokemon,"skos:broader");
        nodePokeLegendaire.addDestination(nodeSkosConcept,"rdf:type");
        nodePokeSauvage.addDestination(nodeSkosConcept,"rdf:type");



        Graph graph = new Graph();
        //POKEMON
        graph.addNode(nodeSalameche);
        graph.addNode(nodeDracaufeu);
        graph.addNode(nodeReptincelle);
        graph.addNode(nodeDracaufeuY);
        graph.addNode(nodeDracaufeuX);
        graph.addNode(nodeCarapuce);
        graph.addNode(nodeCarabaffe);
        graph.addNode(nodeTortank);
        graph.addNode(nodeTortankMega);
        graph.addNode(nodeMew);
        //TYPE
        graph.addNode(nodePokeTypePokeFeu);
        graph.addNode(nodePokeTypePokeVol);
        graph.addNode(nodePokeTypePokePsy);
        graph.addNode(nodePokeTypePokeEau);
        graph.addNode(nodePokeTypePokeDragon);
        graph.addNode(nodePokeTypePoke);

        //NAME
        graph.addNode(nodeFoafSalamecheName);
        graph.addNode(nodeFoafReptincelleName);
        graph.addNode(nodeFoafDracaufeuName);
        graph.addNode(nodeFoafDracaufeuXName);
        graph.addNode(nodeFoafDracaufeuYName);
        graph.addNode(nodeFoafCarapuceName);
        graph.addNode(nodeFoafCarabaffeName);
        graph.addNode(nodeFoafTortankName);
        graph.addNode(nodeFoafTortankMegaName);
        graph.addNode(nodeFoafMewName);
        //CONCEPT
        graph.addNode(nodeSkosConcept);
        graph.addNode(nodePokeLegendaire);
        graph.addNode(nodePokeSauvage);
        graph.addNode(nodePokePokemon);






    }
}