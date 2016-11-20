package shape;

/**
 * 
 * Interface Shape afin de créer differentes formes possibles pour les
 * graphiques, telles que des rectangles, des cercles ou des ellipses.
 * 
 *
 */
public interface Shape {

	/**
	 * Il est necessaire de convertir dans les formes dans un format SVG adapté.
	 * 
	 * 
	 */
	String toFormatSVG();

}
