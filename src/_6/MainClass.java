package _6;

//Write a program to implement your own ArrayList class. It should contain add(), get(), remove(), size() methods.
//Use dynamic array logic. It should increase its size when it reaches threshold.

public class MainClass
{
	public static void main(String args[])
	{
		MyArrayList list = new MyArrayList();
		
		list.add("11");
		list.add("2");
		list.add(3);
		list.add(22);
		list.add(22);

		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Index " + i   + " : " + list.get(i));
		}
		
		System.out.println("Before remoxe size is " + list.size());
		list.remove(1);
		
		for (int i = 0; i < 4; i++) 
		{
			System.out.println("Index " + i   + " : " + list.get(i));
		}
		
		System.out.println("After remoxe size is " + list.size());
	}
}

class MyArrayList
{
	Object array[];
	int pointer = 0;
	
	public MyArrayList() 
	{
		array = new Object[3];
	}
	
	public void add(Object a)
	{
		if(pointer == array.length)
		{
			array = recreateArray(array);
			array[pointer] = a;
			pointer++;
		}
		else
		{
			array[pointer] = a;
			pointer++;
		}
	}
	
	private Object[] recreateArray(Object[] array2) 
	{
		Object newArray[] = new Object[array2.length + 3];
		for(int i = 0 ; i < array2.length ; i++)
		{
			newArray[i] = array2[i]; 
		}
		
		return newArray;
	}
	
	public Object get(int i)
	{
		return array[i];
	}
	
	public void remove(int i)
	{
		for(int k = i + 1 ; k < pointer ; k++ )
		{
			array[k - 1] = array[k];
		}
		array[pointer - 1 ] = 0;
		pointer--;
	}
	
	public int size()
	{
		return pointer;
	}
}
