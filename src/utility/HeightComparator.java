package utility;

import java.util.Comparator;

import shapes.Shape;

/**
 * 
 * Class description: comparator by height attribute
 *
 * @author Ivan Okhrimovich
 *
 */
public class HeightComparator implements Comparator<Shape> 
{
		/**
		 * Compares two objects and returns one 
		 * out of three possible values
		 * 
		 * @Override
		 */
		public int compare(Shape o1, Shape o2)
		{
			if (o1.getHeight() > o2.getHeight())
			{
				return 1;
			}
			else if (o1.getHeight() < o2.getHeight())
			{
				return -1;
			}
			else
			{
				return 0;
			}		
		}
		
}
