package classe;

import java.util.List;

public class Methode extends ObjetClasse {
	List<Variable> arguments;

	public Methode(String type, String nom, List<Variable> arg) {
		super(type, nom);
		this.arguments = arg;
		// TODO Auto-generated constructor stub
	}

	public void display() {
		System.out.println("METHODE : " + "\nType : " + this.getTypeVariable()
				+ "\nNom : " + this.getNom() + "\nListe Arguments : ");
		for (Variable v : arguments) {
			v.display();
		}
	}

}
