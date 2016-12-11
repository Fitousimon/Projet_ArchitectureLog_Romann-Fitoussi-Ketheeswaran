package graph;


import java.util.ArrayList;
import java.util.List;

public class CompositeGraph implements IGraph {
	
	List<IGraph> composite;// Attribut Liste de Graphic, pour le patron de
	// conception composite

	/**
	 * 
	 * CONSTRUCTEURS AVEC ET SANS PARAMETRES
	 * 
	 */

	public CompositeGraph() {
		this.composite = new ArrayList<>();
	}

	public CompositeGraph(List<IGraph> composite) {
		this.composite = composite;
	}
	
	/**
	 * Ajoute un graphique à la liste
	 * 
	 * @param g
	 */

	public void addGraph(IGraph g) {
		this.composite.add(g);
	}

	/**
	 * 
	 * Retire un graphique d'index index à la liste
	 * 
	 * @param index
	 */

	public void removeGraph(int index) {
		this.composite.remove(index);
	}

	/**
	 * 
	 * Imprime tous les Graph contenus dans le CompositeGraph
	 * 
	 */

	@Override
	public void display() {
		for (IGraph g : this.composite) {
			g.display();
		}
		
	}
}
