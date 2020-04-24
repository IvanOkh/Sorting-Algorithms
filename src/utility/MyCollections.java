package utility;


import java.util.Comparator;


/**
 * 
 * Class description: Collection of sorting algorithms
 *
 * @author Ivan Okhrimovich
 *
 */
public final class MyCollections
{		
	/**
	 * Bubble sort
	 *
	 * @param array array of objects
	 * @param comp base or height comparator
	 */
	public static <T> void BubbleSort ( T[] array, Comparator<? super T> comp )
	{
		for(int i = 0; i < array.length; i++ )
		{
			for (int a = 0; a <array.length-1; a++ )

			if( comp.compare( array[a], array[a+1] ) == -1 )
			{
				T temp = array[a];
				array[a] = array[a+1];
				array[a+1] = temp;
			}
		}
		
	}
	
	/**
	 * Bubble Sort
	 *
	 * @param array array of objects
	 */
	public static <T> void BubbleSort ( T[] array )
	{
		for(int i = 0; i < array.length; i++ )
		{
			for (int a = 0; a <array.length-1; a++ )

			if( ((Comparable) array[a]).compareTo(array[a+1])==-1  )
			{
				T temp = array[a];
				array[a] = array[a+1];
				array[a+1] = temp;
			}
		}
		
	}

	/**
	 * Selection sort
	 *
	 * @param array array of objects
	 * @param comp base or height comparator
	 */
	public static <T> void SelectionSort ( T[] array, Comparator<? super T> comp )
	{
		int index = 0;
		
		for(int i = 0; i < array.length - 1; i++ )
		{
			index = i;
			for (int a = i + 1; a <array.length; a++ )
			
			if( comp.compare( array[a], array[index] ) == 1   )
			{
				index = a;
			}
			
			T temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}	
		
	}
	
	/**
	 * Selection sort
	 *
	 * @param array array of objects
	 */
	public static <T> void SelectionSort ( T[] array )
	{
		int index = 0;
		
		for(int i = 0; i < array.length - 1; i++ )
		{
			index = i;
			for (int a = i + 1; a < array.length; a++ )
			
			if( ((Comparable) array[a]).compareTo(array[index])==1  )
			{
				index = a;
			}
			
			T temp = array[index];
			array[index] = array[i];
			array[i] = temp;
		}		
	}
 	
	/**
	 * Gnome sort
	 *
	 * @param array array of objects
	 * @param comp base or height comparator
	 */
	public static <T> void GnomeSort ( T[] array, Comparator<? super T> comp )
	{
		int index = 1;
		int num = 2;
		
		while (index < array.length)
		{
			if ( comp.compare( array[index-1], array[index] ) == 1 
					|| comp.compare( array[index-1], array[index] ) == 0  )
			{
				index = num;
				num++;
			}
			else
			{
				T temp = array[index-1];
				array[index-1] = array[index];
				array[index--] = temp;
				index =(index==0) ? num++: index;
			}
	
		}		
	}
	
	/**
	 * Gnome sort
	 *
	 * @param array array of objects
	 */
	public static <T> void GnomeSort ( T[] array )
	{
		int index = 1;
		int num = 2;
		
		while (index < array.length)
		{
			if( ((Comparable) array[index-1]).compareTo(array[index])==1 
					|| ((Comparable) array[index-1]).compareTo(array[index])==0)
			{
				index = num;
				num++;
			}
			else
			{
				T temp = array[index-1];
				array[index-1] = array[index];
				array[index--] = temp;
				index = (index==0) ? num++: index;
			}
	
		}		
	}
	
	/**
	 * Insertion sort
	 *
	 * @param array array of objects
	 * @param comp base or height comparator
	 */
	public static <T> void InsertionSort ( T[] array, Comparator<? super T> comp  )
	{		
		int a;
		
		for (int i = 1; i < array.length; i++)
		{
			T temp = array[i];
			a = i;
	
			while ((a > 0) && comp.compare(array[a-1], array[i]) <= 1)		
			{
				array [a] = array [a - 1];
				a--; 
			}

			array[a] = temp;			
		}
	}

	/**
	 * Insertion sort
	 *
	 * @param array array of objects
	 */
	public static <T> void InsertionSort ( T[] array )
	{		
		int a;
		
		for (int i = 1; i < array.length; i++)
		{
			T temp = array[i];
			a = i;
			
			while ((a > 0) && ((Comparable) array[a - 1]).compareTo(temp) == -1)			
			{
				array [a] = array [a - 1];
				a--; 
			}

			array[a] = temp;			
		}
	}		    
}
