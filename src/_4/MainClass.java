package _4;


//Write a program to reverse a number using numeric operations.
public class MainClass 
{
	public static void main(String args[])
	{
		int num = 54321099;
		
		System.out.println("Answer = " + findReverse(num));
	}

	private static int findReverse(int num) 
	{
		
		int result = 0;
		int tmp = 0;
		
		while((tmp = num/10) != 0)
		{
			result = ( result * 10) + num % 10; 
			num = num/10;
		}
		
		result = ( result * 10) + num % 10;
		return result;
	}
}
