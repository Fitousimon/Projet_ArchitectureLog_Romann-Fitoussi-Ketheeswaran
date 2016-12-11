package graph;

public class Graph {

	int epaisseurTrait;
	String couleur;

	public Graph() {
		this.couleur = "";
		this.epaisseurTrait = 0;
	}

	public Graph(int e, String c) {
		this.epaisseurTrait = e;
		this.couleur = c;
	}

	public int getEpaisseurTrait() {
		return epaisseurTrait;
	}

	public void setEpaisseurTrait(int epaisseurTrait) {
		this.epaisseurTrait = epaisseurTrait;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

}
