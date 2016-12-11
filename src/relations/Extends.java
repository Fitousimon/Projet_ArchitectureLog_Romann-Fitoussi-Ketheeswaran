package relations;

import graph.IGraph;
import types.Type;

/**
 * 
 * Relation extends
 *
 */
public class Extends extends Relation implements IGraph {

	public Extends() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Extends(String couleur, int epaisseur, Type debut, Type fin) {
		super(couleur, epaisseur, debut, fin);
		this.relation = "EXTENDS";
		// TODO Auto-generated constructor stub
	}

}
