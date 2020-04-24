package shapes;

/**
 * 
 * Class description: Represents a pyramid
 *
 * @author Ivan Okhrimovich
 *
 */
public class Pyramid extends Shape
{
	public double edgeLength;
	
	/**
	 * Default constructor
	 * 
	 * Initializes the newly created Pyramid.
	 */
	public Pyramid()
	{		
	}
	
	/**
	 * User defined constructor
	 * 
	 * Initializes the newly created Pyramid.
	 * @param height
	 * @param edgeLength
	 */
	public Pyramid (double height, double edgeLength)
	{
		super (height);
		this.edgeLength = edgeLength;
	}
	
	/**
	 * Returns edge length
	 *
	 * @return
	 */
	public double getEdgeLength()
	{
		return edgeLength;
	}
	
	/**
	 * Sets edge length
	 *
	 * @param edgeLength
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
		return Math.pow(edgeLength, 2)*getHeight() / 3; 	
	}

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
