package shapes;

/**
 * 
 * Class description: Represents octagonal prism
 *
 * @author Ivan Okhrimovich
 *
 */
public class OctagonalPrism extends Prism
{
	/**
	 * Default constructor
	 * 
	 * Initializes the newly created OctagonalPrism.
	 */
	public OctagonalPrism()
	{		
	}
	
	/**
	 * User defined constructor
	 * 
	 * Initializes the newly created OctagonalPrism.
	 * @param height
	 * @param edgeLength
	 */
	public OctagonalPrism (double height, double edgeLength)
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
		return 2*(1+Math.sqrt(2))*Math.pow(edgeLength, 2);
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
