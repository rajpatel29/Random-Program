package _9;

//Bubble sort
public class MainClass 
{
	public static void main(String args[])
	{
		int array[] = {2, 4, 6, 9, 12, 23, 0, 1, 34};
		int sortedArray[] = bubbleSort(array);
		
		System.out.println();
		System.out.println();

		System.out.println("Sorted Array :)");
		
		for(int i = 0 ; i < sortedArray.length ; i ++)
		{
			System.out.print(sortedArray[i] + " ");
		}
	}

	private static int[] bubbleSort(int[] array) 
	{
		for(int  i = 0 ; i < array.length ; i++)
		{
			for ( int  j = i + 1 ; j < array.length ; j++)
			{
				if(array[j] < array[i])
				{
					int temp =  array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
			for(int k = 0 ; k < array.length ; k++)
			{
				System.out.print(array[k] + " ");
			}
			System.out.println();
		}
		return array;
	}

}
