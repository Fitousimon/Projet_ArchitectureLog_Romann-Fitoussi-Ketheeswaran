package types;

import graph.Graph;

import java.util.ArrayList;
import java.util.List;

import classe.Methode;
import relations.IRelation;

public class Type extends Graph {

	String nom;
	List<IRelation> listeRelations;
	List<Methode> listeMethode;

	public Type() {
		super();
		this.listeRelations = new ArrayList<>();
		this.listeMethode = new ArrayList<>();

		// TODO Auto-generated constructor stub
	}

	public Type(int e, String c, List<IRelation> l, List<Methode> lm) {
		super(e, c);
		this.listeRelations = l;
		this.listeMethode = lm;
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<IRelation> getListeRelations() {
		return listeRelations;
	}

	public void setListeRelations(List<IRelation> listeRelations) {
		this.listeRelations = listeRelations;
	}

	public List<Methode> getListeMethode() {
		return listeMethode;
	}

	public void setListeMethode(List<Methode> listeMethode) {
		this.listeMethode = listeMethode;
	}
	
	

}
