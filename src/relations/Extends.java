package relations;

import types.Type;

public class Extends extends Relation implements IRelation {

	public Extends() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Extends(String couleur, int epaisseur, Type debut, Type fin) {
		super(couleur, epaisseur, debut, fin);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("--------------------------------------------------"
				+ "\nRELATION : EXTENDS\n"
				+ "--------------------------------------------------"
				+ "\nCouleur : " + this.getCouleur() + "\nEpaisseur : "
				+ this.getEpaisseurTrait() + "\nType début : "
				+ this.debut.getNom() + "\nType fin : " + this.fin.getNom());
	}

}
