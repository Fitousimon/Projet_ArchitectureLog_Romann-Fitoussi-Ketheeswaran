package interpretation;

import diagramme.Diagramme;

/**
 * Superclass pour interpreter un diagramme
 *
 */

public class Interpretation {
	Diagramme diag;
	String interpretation;

	public Interpretation(Diagramme diag) {
		super();
		this.diag = diag;
	}

	public Diagramme getDiag() {
		return diag;
	}

	public void setDiag(Diagramme diag) {
		this.diag = diag;
	}

}
