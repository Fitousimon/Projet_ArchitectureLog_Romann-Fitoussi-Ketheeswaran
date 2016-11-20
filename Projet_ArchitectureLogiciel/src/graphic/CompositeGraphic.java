package graphic;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 * Patron de conception composite, utilisé afin de permettre un accès à une
 * Liste de Graphic, diverses méthodes permettent d'ajouter ou de retirer des
 * graphiques de cette liste à la guise de l'utilisateur.
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
	 * Ajoute un graphique à la liste
	 * 
	 * @param g
	 */

	public void addGraphic(Graphic g) {
		this.composite.add(g);
	}

	/**
	 * 
	 * Retire un graphique d'index index à la liste
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
