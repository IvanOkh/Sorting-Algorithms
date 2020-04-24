package application;

import java.io.*;

import java.util.ArrayList;
import java.util.Arrays;

import shapes.Cone;
import shapes.Cylinder;
import shapes.OctagonalPrism;
import shapes.PentagonalPrism;
import shapes.Pyramid;
import shapes.Shape;
import shapes.SquarePrism;
import shapes.TriangularPrism;
import utility.BaseComparator;
import utility.HeightComparator;
import utility.MyCollections;

/**
 * 
 * Class description: Sort Application Driver.
 *
 * @author Ivan Okhrimovich
 *
 */
public class Driver
{

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArrayList <Shape> loadedShapes = new ArrayList<>();
		double firstVal;
		double secondVal;
		long start=0;
		long finish=0;
		Cone con;
		Pyramid pyr;
		Cylinder cyl;
		SquarePrism sqpr;	
		OctagonalPrism octpr;
		TriangularPrism tripr;
		PentagonalPrism pntpr;
		
		String fileName = "";
		String compType = "";
		String sortType = "";
  
        for(int i = 0; i < args.length; i++)
        {

            if(args[i].startsWith("-f") || args[i].startsWith("-F"))
            {
                fileName = args[i].substring(2);
                System.out.println("Filename is "+fileName);       
            }
            if(args[i].startsWith("-t") || args[i].startsWith("-T"))
            {
                compType = args[i].substring(2);
                System.out.println("Compare type is "+compType.toLowerCase());
              
            }
            if(args[i].startsWith("-s") || args[i].startsWith("-S"))
            {
                sortType = args[i].substring(2);  
                System.out.println("Sort Type is "+sortType.toLowerCase());
            }
        }

		try
		{
			BufferedReader br = new BufferedReader(new FileReader(fileName));
	        String fileLine;
	        String[] parts=null;
	        while ((fileLine = br.readLine()) != null) 
	        {
	            parts = fileLine.split(" ");	            
	        }
	        
	        for (int i=0; i<parts.length; i++)
	        {
	        	if (parts[i].equalsIgnoreCase("Cylinder"))
	        	{
	        		firstVal = Double.valueOf(parts[i+1]);
	        		secondVal = Double.valueOf(parts[i+2]);
	        		cyl = new Cylinder(firstVal, secondVal);
	        		loadedShapes.add(cyl);	        		
	        	}
	        	else if (parts[i].equalsIgnoreCase("Cone"))
	        	{
	        		firstVal = Double.valueOf(parts[i+1]);
	        		secondVal = Double.valueOf(parts[i+2]);
	        		con = new Cone(firstVal, secondVal);
	        		loadedShapes.add(con);
	        	}
	        	else if (parts[i].equalsIgnoreCase("Pyramid"))
	        	{
	        		firstVal = Double.valueOf(parts[i+1]);
	        		secondVal = Double.valueOf(parts[i+2]);
	        		pyr = new Pyramid(firstVal, secondVal);
	        		loadedShapes.add(pyr);
	        	}
	        	else if (parts[i].equalsIgnoreCase("SquarePrism"))
	        	{
	        		firstVal = Double.valueOf(parts[i+1]);
	        		secondVal = Double.valueOf(parts[i+2]);
	        		sqpr = new SquarePrism(firstVal, secondVal);
	        		loadedShapes.add(sqpr);
	        	}
	        	else if (parts[i].equalsIgnoreCase("PentagonalPrism"))
	        	{
	        		firstVal = Double.valueOf(parts[i+1]);
	        		secondVal = Double.valueOf(parts[i+2]);
	        		pntpr = new PentagonalPrism(firstVal, secondVal);
	        		loadedShapes.add(pntpr);
	        	}
	        	else if (parts[i].equalsIgnoreCase("OctagonalPrism"))
	        	{
	        		firstVal = Double.valueOf(parts[i+1]);
	        		secondVal = Double.valueOf(parts[i+2]);
	        		octpr = new OctagonalPrism(firstVal, secondVal);
	        		loadedShapes.add(octpr);
	        	}
	        	else if (parts[i].equalsIgnoreCase("TriangularPrism"))
	        	{
	        		firstVal = Double.valueOf(parts[i+1]);
	        		secondVal = Double.valueOf(parts[i+2]);
	        		tripr = new TriangularPrism(firstVal, secondVal);
	        		loadedShapes.add(tripr);
	        	}	        	
	        }
	        	        
	        br.close();
		} 
		catch (FileNotFoundException e){e.printStackTrace();} 
		catch (IOException e){e.printStackTrace();}
		catch (NullPointerException e) {e.printStackTrace();}
		
		Object[] objArray = loadedShapes.toArray();
		Shape[] shapesArray = Arrays.copyOf(objArray, objArray.length, Shape[].class);			
			
	        if (sortType.equalsIgnoreCase("b"))
	        {
	        	if (compType.equalsIgnoreCase("v"))
	        	{
					System.out.println("\nBubble sort by volume begins. Please stand by...");
					start = System.currentTimeMillis();
					MyCollections.BubbleSort(shapesArray);
					finish = System.currentTimeMillis();
					printSortedVolume(shapesArray, finish-start );
	        	}
	        	else if(compType.equalsIgnoreCase("h"))
	        	{
					System.out.println("\nBubble sort by height begins. Please stand by...");
					HeightComparator hc = new HeightComparator();
					start = System.currentTimeMillis();
					MyCollections.BubbleSort(shapesArray, hc);
					finish = System.currentTimeMillis();
					printSortedHeight(shapesArray, finish-start );        		
	        	}
	        	else if(compType.equalsIgnoreCase("a"))
	        	{
					System.out.println("\nBubble sort by base begins. Please stand by...");
					BaseComparator bc = new BaseComparator();
					start = System.currentTimeMillis();
					MyCollections.BubbleSort(shapesArray, bc);
					finish = System.currentTimeMillis();
					printSortedBase(shapesArray, finish-start );
	        	}
	        	else 
	        	{
	        		System.out.println("\nYou have to specify 3 parameters.");
	        	}
	        }
	        
	        else if  (sortType.equalsIgnoreCase("s"))
	        {
	        	if (compType.equalsIgnoreCase("v"))
	        	{
	        		System.out.println("\nSelection sort by volume begins. Please stand by...");
					start = System.currentTimeMillis();
					MyCollections.SelectionSort(shapesArray);
					finish = System.currentTimeMillis();
					printSortedVolume(shapesArray, finish-start );
	        	}
	        	else if(compType.equalsIgnoreCase("h"))
	        	{
					System.out.println("\nSelection sort by height begins. Please stand by...");
					HeightComparator hc = new HeightComparator();
					start = System.currentTimeMillis();
					MyCollections.SelectionSort(shapesArray, hc);
					finish = System.currentTimeMillis();
					printSortedHeight(shapesArray, finish-start );  
	        	}
	        	else if(compType.equalsIgnoreCase("a"))
	        	{
	        		System.out.println("\nSelection sort by base begins. Please stand by...");
					BaseComparator bc = new BaseComparator();
					start = System.currentTimeMillis();
					MyCollections.SelectionSort(shapesArray, bc);
					finish = System.currentTimeMillis();
					printSortedBase(shapesArray, finish-start );
	        	}
	        	else 
	        	{
	        		System.out.println("\nYou have to specify 3 parameters.");
	        	}	        		        	
	        }
	        
	        else if  (sortType.equalsIgnoreCase("z"))
	        {
	         	if (compType.equalsIgnoreCase("v"))
	        	{
	        		System.out.println("\nGnome sort by volume begins. Please stand by...");
					start = System.currentTimeMillis();
					MyCollections.GnomeSort(shapesArray);
					finish = System.currentTimeMillis();
					printSortedVolume(shapesArray, finish-start );
	        	}
	        	else if(compType.equalsIgnoreCase("h"))
	        	{
					System.out.println("\nGnome sort by height begins. Please stand by...");
					HeightComparator hc = new HeightComparator();
					start = System.currentTimeMillis();
					MyCollections.GnomeSort(shapesArray, hc);
					finish = System.currentTimeMillis();
					printSortedHeight(shapesArray, finish-start );  
	        	}
	        	else if(compType.equalsIgnoreCase("a"))
	        	{
	        		System.out.println("\nGnome sort by base begins. Please stand by...");
					BaseComparator bc = new BaseComparator();
					start = System.currentTimeMillis();
					MyCollections.GnomeSort(shapesArray, bc);
					finish = System.currentTimeMillis();
					printSortedBase(shapesArray, finish-start );
	        	}
	        	else 
	        	{
	        		System.out.println("\nYou have to specify 3 parameters.");
	        	}
	        }
	        
	        else if  (sortType.equalsIgnoreCase("i"))
	        {
	         	if (compType.equalsIgnoreCase("v"))
	        	{
	        		System.out.println("\nInsertion sort by volume begins. Please stand by...");
					start = System.currentTimeMillis();
					MyCollections.InsertionSort(shapesArray);						     				
					finish = System.currentTimeMillis();
					printSortedVolume(shapesArray, finish-start );
	        	}
	        	else if(compType.equalsIgnoreCase("h"))
	        	{
					System.out.println("\nInsertion sort by height begins. Please stand by...");
					HeightComparator hc = new HeightComparator();
					start = System.currentTimeMillis();
					MyCollections.InsertionSort(shapesArray, hc);
					finish = System.currentTimeMillis();
					printSortedHeight(shapesArray, finish-start );  
	        	}
	        	else if(compType.equalsIgnoreCase("a"))
	        	{
	        		System.out.println("\nInsertion sort by base begins. Please stand by...");
					BaseComparator bc = new BaseComparator();
					start = System.currentTimeMillis();
					MyCollections.InsertionSort(shapesArray, bc);
					finish = System.currentTimeMillis();
					printSortedBase(shapesArray, finish-start );
	        	}
	        	else 
	        	{
	        		System.out.println("\nYou have to specify 3 parameters.");
	        	}
	        }
	        
	        else if  (sortType.equalsIgnoreCase("m"))
	        {
	        	System.out.println("\nSorry! Merge sort was not implemented :(");
	        }
	        
	        else if  (sortType.equalsIgnoreCase("q"))
	        {
	        	System.out.println("\nSorry! Quick sort was not implemented :(");
	        }
	        
	        else
	        {
	        	System.out.println("\nNo sort has been found with given parameter");
	        }
	        	    
	}
	
	/**
	 * Volume: Prints out first value, last value, every 1000 value 
	 * and time taken to sort array of Shapes
	 *
	 * @param shapesArray array of Shape objects
	 * @param timeTaken time taken to sort array of Shapes
	 */
	private static void printSortedVolume (Shape[] shapesArray, long timeTaken)
	{
		int counter=0;

		System.out.println("\nFirst value is: " +shapesArray[0].getVolume()+"\n");				
		for( int i = 0; i < shapesArray.length; i++ )
		{	
			if (counter == 1000)
			{
				System.out.println(shapesArray[i].getVolume());
				counter = 0;
			}
			
			if (i==shapesArray.length-1)
			{
				System.out.println("\nLast value is: " +shapesArray[i].getVolume());
				System.out.println("\nTime taken to sort: "+ timeTaken+"\n\nSort is done.");
			}
			counter ++;
		}
	}
	
	/**
	 * Height: Prints out first value, last value, every 1000 value 
	 * and time taken to sort array of Shapes
	 *
	 * @param shapesArray array of Shapes
	 * @param timeTaken time taken to sort array of Shapes
	 */
	private static void printSortedHeight (Shape[] shapesArray, long timeTaken)
	{
		int counter=0;

		System.out.println("\nFirst value is: " +shapesArray[0].getHeight()+"\n");				
		for( int i = 0; i < shapesArray.length; i++ )
		{	
			if (counter == 1000)
			{
				System.out.println(shapesArray[i].getHeight());
				counter = 0;
			}
			
			if (i==shapesArray.length-1)
			{
				System.out.println("\nLast value is: " +shapesArray[i].getHeight());
				System.out.println("\nTime taken to sort: "+ timeTaken+"\n\nSort is done.");
			}
			counter ++;
		}
	}
	
	/**
	 * Base Area: Prints out first value, last value, every 1000 value 
	 * and time taken to sort array of Shapes
	 *
	 * @param shapesArray array of Shape objects
	 * @param timeTaken time taken to sort array of Shapes
	 */
	private static void printSortedBase (Shape[] shapesArray, long timeTaken)
	{
		int counter=0;

		System.out.println("\nFirst value is: " +shapesArray[0].getBaseArea()+"\n");				
		for( int i = 0; i < shapesArray.length; i++ )
		{	
			if (counter == 1000)
			{
				System.out.println(shapesArray[i].getBaseArea());
				counter = 0;
			}
			
			if (i==shapesArray.length-1)
			{
				System.out.println("\nLast value is: " +shapesArray[i].getBaseArea());
				System.out.println("\nTime taken to sort: "+ timeTaken+"\n\nSort is done.");
			}
			counter ++;
		}
	}
		
}


