package classe;

public class Variable extends ObjetClasse {

	public Variable(String typeVariable, String nom) {
		super(typeVariable, nom);
	}

	public void display() {
		System.out.println("VARIABLE : " + "\nType : " + this.getTypeVariable()
				+ "\nNom : " + this.getNom());
	}
}
