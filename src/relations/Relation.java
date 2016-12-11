package relations;

import graph.Graph;
import types.Type;

public class Relation extends Graph {

	Type debut;
	Type fin;

	public Relation(String couleur, int epaisseur, Type debut, Type fin) {
		super(epaisseur, couleur);
		this.debut = debut;
		this.fin = fin;
	}

	public Relation() {
		super();
		this.debut = null;
		this.fin = null;
	}

	public Type getDebut() {
		return this.debut;
	}

	public Type getFin() {
		return this.fin;
	}

}
