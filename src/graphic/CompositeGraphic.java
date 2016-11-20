package graphic;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 * Patron de conception composite, utilis� afin de permettre un acc�s � une
 * Liste de Graphic, diverses m�thodes permettent d'ajouter ou de retirer des
 * graphiques de cette liste � la guise de l'utilisateur.
 * 
 * 
 *
 */

public class CompositeGraphic implements Graphic {

	List<Graphic> composite;// Attribut Liste de Graphic, pour le patron de
							// conception composite

	/**
	 * 
	 * CONSTRUCTEURS AVEC ET SANS PARAMETRES
	 * 
	 */

	public CompositeGraphic() {
		this.composite = new ArrayList<>();
	}

	public CompositeGraphic(List<Graphic> composite) {
		this.composite = composite;
	}

	/**
	 * Ajoute un graphique � la liste
	 * 
	 * @param g
	 */

	public void addGraphic(Graphic g) {
		this.composite.add(g);
	}

	/**
	 * 
	 * Retire un graphique d'index index � la liste
	 * 
	 * @param index
	 */

	public void removeGraphic(int index) {
		this.composite.remove(index);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

}
