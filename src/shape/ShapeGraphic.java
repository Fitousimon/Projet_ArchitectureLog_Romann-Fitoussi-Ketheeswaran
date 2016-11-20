package shape;

import java.awt.Point;

public class ShapeGraphic {
	Point point;
	int epaisseurTrait;
	String color;

	public ShapeGraphic(Point p, int e, String c) {
		this.point = p;
		this.epaisseurTrait = e;
		this.color = c;
	}

	/**
	 * Afin de placer les graphiques convenablement, il convient d'utiliser les
	 * coordonnées d'un point central au graphique (par exemple le centre d'un
	 * cercle, ou l'intersection des diagonales d'un rectangle, cela depend de
	 * la forme choisie). Cette méthode permet de renvoyer le dit-point.
	 * 
	 * 
	 */
	public Point getPoint() {
		return this.point;
	}

	/**
	 * L'utilisateur souhaite pouvoir moduler l'epaisseur des traits du
	 * diagramme
	 * 
	 */
	public int getEpaisseurTrait() {
		return epaisseurTrait;
	}

	/**
	 * 
	 * L'utilisateur souhaite pouvoir acceder à la couleur du diagramme
	 */
	public String getColor() {
		return color;
	}
}
