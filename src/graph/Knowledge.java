package graph;
import in.keyboard.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import in.keyboard.*;

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
        Node nodePokeMega = new Node("Mega", "poke");
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
        nodeSalameche.addDestination(nodeCarapuce,"rdfs:seeAlso");
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
        nodeDracaufeu.addDestination(nodeDracaufeuX,"poke:evolution");
        nodeDracaufeu.addDestination(nodeDracaufeuY,"poke:evolution");
        nodeDracaufeu.addDestination(nodePokeTypePokeFeu,"rdf:type");
        nodeDracaufeu.addDestination(nodePokeTypePokeVol,"rdf:type");
        //DracaufeuY
        nodeDracaufeuY.addDestination(nodeFoafDracaufeuYName,"foaf:name");
        nodeDracaufeuY.addDestination(nodePokeTypePokeFeu,"rdf:type");
        nodeDracaufeuY.addDestination(nodePokeTypePokeVol,"rdf:type");
        nodeDracaufeuY.addDestination(nodePokeMega,"rdf:type");
        nodeDracaufeuY.addDestination(nodeDracaufeu,"rdfs:seeAlso");

        //DracaufeuX
        nodeDracaufeuX.addDestination(nodeFoafDracaufeuXName,"foaf:name");
        nodeDracaufeuX.addDestination(nodePokeTypePokeFeu,"rdf:type");
        nodeDracaufeuX.addDestination(nodePokeTypePokeDragon,"rdf:type");
        nodeDracaufeuX.addDestination(nodeDracaufeu,"rdfs:seeAlso");
        nodeDracaufeuX.addDestination(nodePokeMega,"rdf:type");

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
        nodeTortank.addDestination(nodeTortankMega,"poke:evolution");
        nodeTortank.addDestination(nodePokeTypePokeEau,"rdf:type");
        //Mega-Tortank
        nodeTortankMega.addDestination(nodeFoafTortankMegaName,"foaf:name");
        nodeTortankMega.addDestination(nodeTortank,"rdfs:seeAlso");
        nodeTortankMega.addDestination(nodePokeTypePokeEau,"rdf:type");
        nodeTortankMega.addDestination(nodePokeMega,"rdf:type");

        //Mew
        nodeMew.addDestination(nodeFoafMewName,"foaf:name");
        nodeMew.addDestination(nodePokeTypePokePsy,"rdf:type");
        nodeMew.addDestination(nodePokeLegendaire,"rdf:type");

        //Type
        nodePokeTypePokeFeu.addDestination(nodePokeTypePoke,"skos:broader");
        nodePokeTypePokeVol.addDestination(nodePokeTypePoke,"skos:broader");
        nodePokeTypePokePsy.addDestination(nodePokeTypePoke,"skos:broader");
        nodePokeTypePokeEau.addDestination(nodePokeTypePoke,"skos:broader");
        nodePokeTypePokeDragon.addDestination(nodePokeTypePoke,"skos:broader");
        nodePokeTypePoke.addDestination(nodeSkosConcept,"rdf:type");
        //Type poké
        nodePokeLegendaire.addDestination(nodePokePokemon,"skos:broader");
        nodePokeMega.addDestination(nodePokePokemon,"skos:broader");
        nodePokeSauvage.addDestination(nodePokePokemon,"skos:broader");
        nodePokeLegendaire.addDestination(nodeSkosConcept,"rdf:type");
        nodePokeMega.addDestination(nodeSkosConcept,"rdf:type");
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

    /*    System.out.println(nodeSalameche.toString());
        System.out.println(nodeDracaufeu.toString());*/
        long startTime = System.nanoTime();
        graph.rechercheEvolution(nodeCarapuce);
        graph.rechercheSeeAlso(nodeSalameche);
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds : " +
                timeElapsed / 1000000);
        graph.rechercheType();*/
        
        int choix;
        int choixIDPokemon;
        boolean fini = false;
        while(!fini) {
	        System.out.println("1- Affichier les relations d'un pokemon avec les autres pokemon\n");
	        System.out.println("2- Afficher les evolutions d'un pokemon\n");
	        System.out.println("3- Afficher tout les type de pokemon\n");
	        System.out.println("4- Quitter\n");
	        System.out.println("Veuillez saisir votre choix : ");
	        choix = Keyboard.getInt();
	        System.out.println("\n");
	        switch(choix) {
	        case 1 :
	        	graph.afficherListePokemon();
	        	System.out.println("\nVeuillez saisir l'ID du pokemon souhaite : ");
	        	choixIDPokemon = Keyboard.getInt();
	        	while(choixIDPokemon < 1 || choixIDPokemon > graph.recherchePokemon().size) {
	        		System.out.println("\nID de pokemon incorrect, veuillez en saisir un a nouveau : ");
	        	}
	        	System.out.println("\n");
	        	graph.rechercheSeeAlso(graph.getNodeById(choixIDPokemon));
	        	break;
	        case 2 :
	        	graph.afficherListePokemon();
	        	System.out.println("\nVeuillez saisir l'ID du pokemon souhaite : ");
	        	choixIDPokemon = Keyboard.getInt();
	        	while(choixIDPokemon < 1 || choixIDPokemon > graph.recherchePokemon().size) {
	        		System.out.println("\nID de pokemon incorrect, veuillez en saisir un a nouveau : ");
	        	}
	        	System.out.println("\n");
	        	graph.rechercheEvolution(graph.getNodeById(choixIDPokemon));
	        	break;
	        case 3:
	        	graph.rechercheType();
	        	break;
	        case 4:
	        	fini = true;
	        	break;
	        }
        }
        

    private static void traitementChoix(int choix,boolean fini) {
        switch (choix){
            case 0:fini=true;break;
            case 1:
        }
    }

    private static int saisieMenu() {
        int choix;
        System.out.println("Veuillez entrer un choix entre 0 et 3");
        choix = in.keyboard.Keyboard.getInt();
        while(choix<0 && choix >4){
            System.out.println("Veuillez entrer un choix valide entre 0 et 3");
            choix = in.keyboard.Keyboard.getInt();
        }
        return choix;
    }

    private static void afficheMenu() {
        System.out.println("Veuillez choisir une demande sur le graphe : ");
        System.out.println("1 - Lister tous les types de pokémons");
        System.out.println("2 - Lister les pokémons en relation avec un autre ");
        System.out.println("3 - Lister toutes les évolutions d'un pokémon ");
        System.out.println("0 - Pour quitter");

    }
}