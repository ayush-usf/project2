package comparators;

import shapes.Shape;
import java.util.Comparator;

/** A custom comparator that compares shapes by name alphabetically.
 *  Note: you need to write other Comparators as specified in the project description
 *  and add them to the comparator package. */
public class NameComparator implements Comparator<Shape>{

	/**
	 * Compare shapes based on the name
	 * @param shape1 first shape
	 * @param shape2 second shape
	 * @return 0 if names of shapes are equal, a negative value if the name of shape1 is less than
	 * the name of shape2, and a positive value otherwise.
	 */
	@Override
	public int compare(Shape shape1, Shape shape2) {
		// FILL IN CODE

		return 0; // change as needed
	}

}
