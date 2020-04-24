package shapes;

/**
 * 
 * Class description: Represents a cone
 *
 * @author Ivan Okhrimovich
 *
 */
public class Cone extends Shape
{
	public double radius;
	
	/**
	 * Default constructor
	 * 
	 * Initializes the newly created Cone.
	 */
	public Cone()
	{		
	}
	
	/**
	 * User defined constructor
	 * 
	 * Initializes the newly created Cone.
	 * @param height
	 * @param radius
	 */
	public Cone (double height, double radius)
	{
		super (height);
		this.radius = radius;
	}
	
	/**
	 * Returns radius
	 *
	 * @return radius
	 */
	public double getRadius()
	{
		return radius;
	}
	
	/**
	 * Sets radius
	 *
	 * @param radius
	 */
	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	/**
	 * Calculates base area 
	 *
	 * @Override
	 */
	public double getBaseArea()
	{
		 return Math.PI*Math.pow(radius, 2);
	}
	
	/**
	 * Calculates volume
	 *
	 * @Override
	 */
	public double getVolume()
	{
		 return Math.PI*Math.pow(radius, 2) * (1.0/3.0) * getHeight();
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
	
	/**
	 * String representation of an object
	 */
	public String toString()
	{
		return "Cone " + getHeight()+" "+getRadius()+" ";
	}

}
