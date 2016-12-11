package types;

import graph.Graph;

import java.util.ArrayList;
import java.util.List;

import classe.Methode;

/**
 * 
 * Superclasse representant un type (interface ou classe)
 *
 */

public class Type extends Graph {
	String type;
	String nom;
	List<Methode> listeMethode;

	public Type() {
		super();
		this.listeMethode = new ArrayList<>();
		this.nom = "";

		// TODO Auto-generated constructor stub
	}

	public Type(int e, String c, String nom, List<Methode> lm) {
		super(e, c);
		this.listeMethode = lm;
		this.nom = nom;
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.type = nom;
	}

	public List<Methode> getListeMethode() {
		return listeMethode;
	}

	public void setListeMethode(List<Methode> listeMethode) {
		this.listeMethode = listeMethode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
