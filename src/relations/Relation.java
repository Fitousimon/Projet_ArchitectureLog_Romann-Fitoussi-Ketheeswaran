package relations;

import graph.Graph;
import types.Type;

/**
 * 
 * Superclasse definissant une relation (heritage ou implementation)
 *
 */

public class Relation extends Graph {

	String relation;
	Type debut;
	Type fin;

	public Relation(String couleur, int epaisseur, Type debut, Type fin) {
		super(epaisseur, couleur);
		this.debut = debut;
		this.fin = fin;

	}

	public Relation() {
		super();
		this.debut = null;
		this.fin = null;
	}

	public Type getDebut() {
		return this.debut;
	}

	public Type getFin() {
		return this.fin;
	}

	/**
	 * Affiche la relation sous format texte
	 */
	public void display() {
		System.out.println("--------------------------------------------------"
				+ "\nRELATION : " + this.relation + "\n"
				+ "--------------------------------------------------"
				+ "\nCouleur : " + this.getCouleur() + "\nEpaisseur : "
				+ this.getEpaisseurTrait() + "\nType début : "
				+ this.debut.getNom() + "\nType fin : " + this.fin.getNom());
		System.out.println("");
	}

}
