package shapes;

/**
 * 
 * Class description: Represents pentagonal prism
 *
 * @author Ivan Okhrimovich
 *
 */
public class PentagonalPrism extends Prism
{
	/**
	 * Default constructor
	 * 
	 * Initializes the newly created PentagonalPrism.
	 */
	public PentagonalPrism()
	{		
	}
	
	/**
	 * User defined constructor
	 * 
	 * Initializes the newly created PentagonalPrism.
	 * @param height
	 * @param edgeLength
	 */
	public PentagonalPrism (double height, double edgeLength)
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
		return (5 * Math.pow(edgeLength, 2) * Math.tan(Math.toRadians(54)))/4 ;
	}
	
	/**
	 * Calculates volume
	 *
	 * @Override
	 */
	public double getVolume()
	{
		return getBaseArea() * getHeight();
	}
	
}
