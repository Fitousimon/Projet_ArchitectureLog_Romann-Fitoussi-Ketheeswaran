package diagramme;

import graph.IGraph;

import java.util.List;

import relations.Relation;
import types.Classe;
import types.Interface;

/**
 * 
 * Classe representant un diagramme, celui ci dispose d'une liste de relation,
 * d'une liste de classes et d'une liste d'interface, le but etant d'afficher ce
 * diagramme à l'aide d'un interpretateur
 *
 */

public class Diagramme implements IGraph {
	List<Relation> listeRelations;
	List<Classe> listeClasse;
	List<Interface> listeInterface;

	public Diagramme(List<Relation> listeRelations, List<Classe> listeClasse,
			List<Interface> listeInterface) {
		super();
		this.listeRelations = listeRelations;
		this.listeClasse = listeClasse;
		this.listeInterface = listeInterface;
	}

	@Override
	public void display() {
		for (Classe c : listeClasse) {
			c.display();
		}
		for (Interface i : listeInterface) {
			i.display();
		}
		for (Relation r : listeRelations) {
			r.display();
		}
	}

}
