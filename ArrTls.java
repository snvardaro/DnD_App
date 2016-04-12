import java.io.Scanner;

public class ArrTls
{
	public static < E > void addToEnd(E array, int size, E value);
	{
		array[size] = value;
		++size;
	}
	
	public static < E > void addElement (E array, int size, int index, E value)
	{
	  // Make room for the insertion
	  int toBeMoved = size - 1;
	  while (toBeMoved >= index) 
	  {
		array[toBeMoved+1] = array[toBeMoved];
		--toBeMoved;
	  }
	  // Insert the new value
	  array[index] = value;
	  ++size;
	}
	
	public static < E > void addInOrder (E array, int size, E value)
	{
	  // Make room for the insertion
	  int toBeMoved = size - 1;
	  while ((toBeMoved >= 0) && (value < array[toBeMoved])) 
	  {
		array[toBeMoved+1] = array[toBeMoved];
		--toBeMoved;
	  }
	  // Insert the new value
	  array[toBeMoved+1] = value;
	  ++size;
	}
	
	public static < E > void insertionSort (E array, int size, E value)
	{
	  for (int firstOutOfOrder = 1; firstOutOfOrder < size; 
		   ++firstOutOfOrder)
		{
		 value = array[firstOutOfOrder];
		 int toBeMoved = firstOutOfOrder - 1;
		 while (toBeMoved >= 0 && value < array[toBeMoved]) {
		   array[toBeMoved+1] = array[toBeMoved];
		   --toBeMoved;
		 }
		 // Insert the new value
		 array[toBeMoved+1] = value;
	   }
	}
	
	public static < E > int seqSearch(const E list[], int listLength, E searchItem)
	{
		int loc;

		for (loc = 0; loc < listLength; loc++)
			if (list[loc] == searchItem)
				return loc;

		return -1;
	}
	
	public static < E > int seqOrderedSearch(const E list[], int listLength, E searchItem)
	{
		int loc = 0;

		while (loc < listLength && list[loc] < searchItem)
		  {
		   ++loc;
		  }
		if (loc < listLength && list[loc] == searchItem)
		   return loc;
		else
		   return -1;
	}
	
	public static < E > int binarySearch(const E list[], int listLength, E searchItem)
	{
		int first = 0;
		int last = listLength - 1;
		int mid;

		Boolean found = false;

		while (first <= last && !found)
		{
			mid = (first + last) / 2;

			if (list[mid] == searchItem)
				found = true;
			else 
				if (searchItem < list[mid])
					last = mid - 1;
				else
					first = mid + 1;
		}

		if (found) 
			return mid;
		else
			return -1;
	}
	
	public static < E > void removeElement (E array, int& size, E value)
	{
	  int toBeMoved = (binarySearch(array, size, value)) + 1;
	  while (toBeMoved < size) 
	  {
		array[toBeMoved] = array[toBeMoved+1];
		++toBeMoved;
	  }
	  --size;
	}
	
}
