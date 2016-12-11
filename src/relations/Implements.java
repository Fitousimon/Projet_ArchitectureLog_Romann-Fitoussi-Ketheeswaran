package relations;

import graph.IGraph;
import types.Type;

/**
 * 
 * Relation implements
 *
 */

public class Implements extends Relation implements IGraph {

	public Implements(String couleur, int epaisseur, Type debut, Type fin) {
		super(couleur, epaisseur, debut, fin);
		this.relation = "IMPLEMENTS";
		// TODO Auto-generated constructor stub
	}

	public Implements() {
		super();
	}

}
