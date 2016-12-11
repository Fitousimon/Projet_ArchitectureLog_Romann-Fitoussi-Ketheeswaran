package types;

import java.util.List;

import classe.Methode;

/**
 * 
 * Classe representant le type interface
 *
 */

public class Interface extends Type implements IType {

	public Interface() {
		super();
		this.type = "Interface";

		// TODO Auto-generated constructor stub
	}

	public Interface(int e, String c, String nom, List<Methode> lm) {
		super(e, c, nom, lm);
		this.type = "Interface";

		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("--------------------------------------------------"
				+ "\nINTERFACE : " + this.getNom()
				+ "\n--------------------------------------------------");

		for (Methode m : this.getListeMethode()) {
			m.display();
			System.out.println("");
		}
	}
}
