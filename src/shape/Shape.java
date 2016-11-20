package shape;

/**
 * 
 * Interface Shape afin de cr�er differentes formes possibles pour les
 * graphiques, telles que des rectangles, des cercles ou des ellipses.
 * 
 *
 */
public interface Shape {

	/**
	 * Il est necessaire de convertir dans les formes dans un format SVG adapt�.
	 * 
	 * 
	 */
	String toFormatSVG();

}
