package shapes;

/**
 * 
 * Class description: Represents triangular prism
 *
 * @author Ivan Okhrimovich
 *
 */
public class TriangularPrism extends Prism
{
	/**
	 * Default constructor
	 * 
	 * Initializes the newly created TriangularPrism.
	 */
	public TriangularPrism()
	{		
	}
	
	/**
	 * User defined constructor
	 * 
	 * Initializes the newly created TriangularPrism.
	 * @param height
	 * @param edgeLength
	 */
	public TriangularPrism (double height, double edgeLength)
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
		return (Math.pow(edgeLength, 2)*Math.sqrt(3))/4;
	}
	
	/**
	 * Calculates volume
	 *
	 * @Override
	 */
	public double getVolume()
	{		
		return getBaseArea()*getHeight();
	}

}
