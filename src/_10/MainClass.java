package _10;

//Insertion sort
public class MainClass 
{
	public static void main(String args[])
	{
		int array[] = {6 , 2, 4, 3, 12, 23, 0, 1, 34};
		int sortedArray[]  =  insertionSort(array);
	}
	
	private static int[] insertionSort(int[] array)
	{
		for(int  i = 1 ; i < array.length ; i++)
		{
			int temp = array[i];
			int index = i;
			for(int k = i - 1 ; k >= 0 ; k-- )
			{
				if(array[k] < temp)
				{
					break;
				}
				else
				{
					int tem = array[index];
					array[index] = array[k];
					array[k] = tem;
					index = k;
				}
			}
			for(int l = 0 ; l < array.length ; l++)
			{
				System.out.print(array[l] + " ");
			}
			System.out.println();
		}
		
		return array;
	}
}
