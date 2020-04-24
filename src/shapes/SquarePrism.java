package shapes;

/**
 * 
 * Class description: Represents square prism
 *
 * @author Ivan Okhrimovich
 *
 */
public class SquarePrism extends Prism
{
	/**
	 * Default constructor
	 * 
	 * Initializes the newly created SquarePrism.
	 */
	public SquarePrism()
	{		
	}
	
	/**
	 * User defined constructor
	 * 
	 * Initializes the newly created SquarePrism.
	 * @param height
	 * @param edgeLength
	 */
	public SquarePrism (double height, double edgeLength)
	{
		super (height, edgeLength);
	}

	/**
	 * Calculates base area 
	 *
	 * @Override
	 */
	public double getBaseArea()
	{
		return Math.pow(edgeLength, 2);
	}
	
	/**
	 * Calculates volume
	 *
	 * @Override
	 */
	public double getVolume()
	{
		return Math.pow(edgeLength, 2)*getHeight();
	}

}
