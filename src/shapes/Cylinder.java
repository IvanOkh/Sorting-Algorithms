package shapes;

/**
 * 
 * Class description: Represents a cylinder
 *
 * @author Ivan Okhrimovich
 *
 */
public class Cylinder extends Shape
{
	public double radius;
	
	/**
	 * Default constructor
	 * 
	 * Initializes the newly created Cylinder.
	 */
	public Cylinder()
	{		
	}
	
	/**
	 * User defined constructor
	 * 
	 * Initializes the newly created Cylinder.
	 * @param height
	 * @param radius
	 */
	public Cylinder (double height, double radius)
	{
		super (height);
		this.radius = radius;
	}
	
	/**
	 * Returns radius
	 *
	 * @return
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
	     double p = 3.14159;
		 return p*Math.pow(radius, 2); 
	}
	
	/**
	 * Calculates volume
	 *
	 * @Override
	 */
	public double getVolume()
	{
	    double p = 3.14159;
		return p*Math.pow(radius, 2)*getHeight();	
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
