package classe;

import java.util.ArrayList;

/**
 * Classe representant une methode d'une classe
 */
import java.util.List;

public class Methode extends ObjetClasse {
	List<Variable> arguments;

	public Methode(String type, String nom) {
		super(type, nom);
		this.arguments = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	public Methode(String type, String nom, List<Variable> arg) {
		super(type, nom);
		this.arguments = arg;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Ecrit la methode dans la console
	 */
	public void display() {
		System.out.print("METHODE : " + this.getTypeVariable() + " "
				+ this.getNom() + "(");

		for (Variable v : arguments) {
			System.out.print(v.getTypeVariable() + " " + v.getNom() + ",");
		}
		System.out.print(")");

	}

}
