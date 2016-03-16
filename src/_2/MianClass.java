package _2;

//You are given an array of numbers. Find out the array index or position where sum of numbers preceeding the index is equals to sum of
//numbers succeeding the index.

public class MianClass
{
	public static void main(String args[])
	{
		int array[] = {5,1,2,3 , 5,3,2,1};
		int index;
		FindIndexClass findIndexObj= new FindIndexClass();
		
		try
		{
			index = FindIndexClass.findIndex(array);
			System.out.println("Index = " + index);
		}
		catch(RuntimeException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}

class FindIndexClass
{
	public static int findIndex(int array[])
	{
		int result = 0;
		int firstIndex = 0;
		int lastIndex = array.length - 1;
		int beforeSum = 0 ;
		int afterSum = 0;
		
		while(firstIndex <  lastIndex || firstIndex == lastIndex)
		{
			if(beforeSum < afterSum)
			{
				beforeSum += array[firstIndex];
				firstIndex++;
			}
			else
			{
				afterSum += array[lastIndex];
				lastIndex--;
			}
		}
		
		if(beforeSum == afterSum)
		{
			result = lastIndex  ;
		}
		else
		{
			throw new RuntimeException("Invalid Inputs ");
		}
		return result;
	}
}
