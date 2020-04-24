package shapes;

/**
 * 
 * Class description: Represents a prism
 *
 * @author Ivan Okhrimovich
 *
 */
public abstract class Prism extends Shape
{
	public double edgeLength;
	
	/**
	 * Default constructor
	 * 
	 * Initializes the newly created Prism.
	 */
	public Prism()
	{		
	}
	
	/**
	 * User defined constructor
	 * 
	 * Initializes the newly created Prism.
	 * @param height
	 * @param edgeLength
	 */
	public Prism (double height, double edgeLength)
	{
		super (height);
		this.edgeLength = edgeLength;
	}
	
	/**
	 * Returns edge length
	 *
	 * @return edgeLength
	 */
	public double getEdgeLength()
	{
		return edgeLength;
	}
	
	/**
	 * Sets edge length
	 *
	 * @param radius
	 */
	public void setEdgeLength(double edgeLength)
	{
		this.edgeLength = edgeLength;
	}
	
	/**
	 * Calculates base area
	 * 
	 * @Override
	 */
	public abstract double getBaseArea();


	/**
	 * Calculates volume
	 * 
	 * @Override
	 */
	public abstract double getVolume();

	/**
	 * Compares itself to other shape
	 *
	 * @Override
	 */
	public int compareTo(Shape sh)
	{

		if (this.getVolume() > sh.getVolume())
		{
			return 1;
		}
		else if (this.getVolume() < sh.getVolume())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
