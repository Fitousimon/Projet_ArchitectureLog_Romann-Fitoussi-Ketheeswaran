package shape;

import java.awt.Point;

public class Rectangle extends ShapeGraphic implements Shape {
	int largeur;
	int longueur;

	public Rectangle(int largeur, int longueur, Point p, int e, String c) {
		super(p, e, c);
		this.largeur = largeur;
		this.longueur = longueur;
	}

	@Override
	public String toFormatSVG() {
		// TODO Auto-generated method stub
		return null;
	}

}
