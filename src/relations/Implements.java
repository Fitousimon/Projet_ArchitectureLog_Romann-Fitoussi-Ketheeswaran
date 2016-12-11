package relations;

import types.Type;

public class Implements extends Relation implements IRelation {

	public Implements(String couleur, int epaisseur, Type debut, Type fin) {
		super(couleur, epaisseur, debut, fin);
		// TODO Auto-generated constructor stub
	}

	public Implements() {
		super();
	}

	@Override
	public void display() {
		System.out.println("--------------------------------------------------"
				+ "\nRELATION : IMPLEMENTS\n"
				+ "--------------------------------------------------"
				+ "\nCouleur : " + this.getCouleur() + "\nEpaisseur : "
				+ this.getEpaisseurTrait() + "\nType début : "
				+ this.debut.getNom() + "\nType fin : " + this.fin.getNom());
	}
}
