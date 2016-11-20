package shape;

import java.awt.Point;

public class Circle extends ShapeGraphic implements Shape {
	int rayon;
	Point point;

	public Circle(int rayon, Point p, int e, String c) {
		super(p, e, c);
		this.rayon = rayon;

	}

	@Override
	public String toFormatSVG() {
		// TODO Auto-generated method stub
		return null;
	}

}
