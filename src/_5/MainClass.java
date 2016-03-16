package _5;

//Write a program to convert decimal number to binary format using numeric operations.
public class MainClass 
{
	public static void main(String args[])
	{
		int num = 5;
		System.out.println("Answer = " + findBinary(num));
	}

	private static int findBinary(int num) 
	{
		int result = 0;
		int tmp = 0;
		while((tmp = num/2) != 0)
		{
			result = (result * 10) + (num%2);
			num = num/2 ;
		}
		result = (result * 10) + (num%2);
		
		return result;
	}
}


