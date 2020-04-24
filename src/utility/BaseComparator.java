package utility;

import java.util.Comparator;

import shapes.Shape;

/**
 * 
 * Class description: comparator by base area attribute
 *
 * @author Ivan Okhrimovich
 *
 */
public class BaseComparator implements Comparator<Shape> 
{

		/**
		 * Compares two objects and returns one 
		 * out of three possible values
		 * 
		 * @Override
		 */
		public int compare(Shape o1, Shape o2)
		{
			if (o1.getBaseArea() > o2.getBaseArea())
			{
				return 1;
			}
			else if (o1.getBaseArea() < o2.getBaseArea())
			{
				return -1;
			}
			else
			{
				return 0;
			}
			
		}
		
}
