package shapes;

import java.util.*;

/**
 * ShapeSorter stores a collection of shapes and is able to sort shapes based
 * on different criteria. Stores shapes in a map that has three keys: "all", "2D", "3D".
 * For each key, stores a list of shapes that correspond to this key.
 * For instance:
 * - for the key "all", the corresponding value is the list of all shapes
 * - for the key "2D", the corresponding value is the list of two-dimensional shapes
 * - for the key "3D", the corresponding value is the of three-dimensional shapes
 *
 * The class provides a method to sort shapes of a given type with the given Comparator.
 * For general shapes we have an option to sort by area or by name.
 * For 2d shapes, we can sort by area, by perimeter or by name.
 * For 3d shapes, we can sort by area, by volume or by name.
 *
 * Do NOT change the signatures of methods in this class, but you may add more methods of your own.
 * @author okarpenko
 *
 */
public class ShapeSorter {
	private Map<String, List<Shape>>  shapesMap; // see the comment above the class for the description of the map

	/**
	 * Constructor for class ShapeSorter. Reads information about each shape from the given input file,
	 * creates an object of the appropriate class and adds it to the shapesMap.
	 * @param inputFile
	 */
	public ShapeSorter(String inputFile) {
		// FILL IN CODE: load shapes from the given input file


	}

	/**
	 * Sort a list of Shapes
	 *
	 * @param type A string, either "all", "2D" or "3D" - specifies which shapes to sort
	 * @param comparator  A Comparator that tells the method how to sort shapes.
	 */
	public void sortShapes(String type, Comparator<? extends Shape> comparator) {
		// FILL IN CODE

	}

	/**
	 * Print the list of shapes to a file as following:
	 * First, all 2D shapes, one line per shape;
	 * each shape is printed according to the toString() method in the corresponding parent class.
	 * An empty line after printing all 2D shapes.
	 *
	 * Then all 3D shapes, one line per shape;
	 * each shape is printed according to the toString() method in the corresponding parent class.
	 * An empty line after printing all 3D Shapes.
	 *
	 * Then all shapes.
	 * Each shape is printed according to the format specified in the toString()
	 * method of the corresponding parent class
	 * An empty line.
	 *
	 * See expectedOutput1 and expectedOutput2 in the output folder
	 * @param filename
	 * 			the name of the output file
	 */
	public void printToFile(String filename) {
		// FILL IN CODE
		// This method must catch IOException


	}

}
