package shape;

import java.awt.Point;

public class Arrow extends ShapeGraphic implements Shape {

	Point boutDeFleche;

	public Arrow(Point p1, Point p2, int e, String c) {
		super(p1, e, c);
		this.boutDeFleche = p2;
	}

	@Override
	public String toFormatSVG() {
		return null;
	}

}
