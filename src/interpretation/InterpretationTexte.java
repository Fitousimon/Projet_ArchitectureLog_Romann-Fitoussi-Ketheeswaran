package interpretation;

import diagramme.Diagramme;

/**
 * 
 * Interpretation sous format texte dans la console
 *
 */

public class InterpretationTexte extends Interpretation {

	public InterpretationTexte(Diagramme diag) {
		super(diag);
		this.interpretation = "Texte";
	}

	public void interpretation() {
		this.diag.display();
	}

}
