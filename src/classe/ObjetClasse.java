package classe;

public class ObjetClasse {

	String nom;
	String type;

	public ObjetClasse(String type, String nom) {
		super();
		this.type = type;
		this.nom = nom;
	}

	public String getTypeVariable() {
		return type;
	}

	public void setTypeVariable(String typeVariable) {
		this.type = typeVariable;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
