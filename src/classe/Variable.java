package classe;

/**
 * Classe representant une variable d'instance
 *
 */

public class Variable extends ObjetClasse {

	public Variable(String typeVariable, String nom) {
		super(typeVariable, nom);
	}

	public void display() {
		System.out.println("VARIABLE : " + this.getTypeVariable() + " "
				+ this.getNom());
	}
}
