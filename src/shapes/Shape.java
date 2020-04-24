package shapes;

/**
 * 
 * Class description: Represents a shape
 *
 * @author Ivan Okhrimovich
 *
 */
public abstract class Shape implements Comparable<Shape> 
{
	private double height;
	
	/**
	 * Default constructor
	 * 
	 * Initializes an empty Shape object with default values 
	 * for all attributes.
	 */
	public Shape()
	{
		
	}
	
	/**
	 * User defined constructor
	 * 
	 * Initializes the newly created Shape.
	 * @param height
	 */
	public Shape(double height)
	{
		super();
		this.height = height;
	}
	
	/**
	 * Returns height 
	 *
	 * @return height
	 */
	public double getHeight()
	{
		return height;
	}
	
	/**
	 * Sets height
	 *
	 * @param height
	 */
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	/**
	 * Calculates base area
	 *
	 * @return base area
	 */
	public abstract double getBaseArea();
	
	/**
	 * Calculates volume
	 *
	 * @return volume
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
	
	/**
	 * String representation of an object
	 */
	public String toString()
	{
		return "Height is "+height+" ";
	}
}
