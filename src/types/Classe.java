package types;

import java.util.ArrayList;
import java.util.List;

import classe.Methode;
import classe.Variable;

/**
 * 
 * Classe representant le type classe
 */

public class Classe extends Type implements IType {

	List<Variable> listeVariable;

	public Classe() {
		super();
		listeVariable = new ArrayList<>();
		listeMethode = new ArrayList<>();
		this.type = "Classe";

		// TODO Auto-generated constructor stub
	}

	public Classe(int e, String c, String nom, List<Variable> lv,
			List<Methode> lm) {
		super(e, c, nom, lm);
		this.listeVariable = lv;
		this.type = "Classe";
		// TODO Auto-generated constructor stub
	}

	public List<Variable> getListeVariable() {
		return listeVariable;
	}

	public void setListeVariable(List<Variable> listeVariable) {
		this.listeVariable = listeVariable;
	}

	@Override
	public void display() {
		System.out.println("--------------------------------------------------"
				+ "\nCLASSE : " + this.getNom()
				+ "\n--------------------------------------------------");

		for (Variable v : this.getListeVariable()) {
			v.display();
			System.out.println("");
		}
		for (Methode m : this.getListeMethode()) {
			m.display();
			System.out.println("");
		}

	}

}
