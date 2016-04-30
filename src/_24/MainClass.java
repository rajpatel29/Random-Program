package _24;

//Given an integer, write a function to determine if it is a power of three.
//Could you do it without using any loop / recursion?

public class MainClass 
{
	public static void main(String args[])
	{
		System.out.println(isPowerOfThree(1));
	}
	
	public static boolean isPowerOfThree(int n) 
	{
		boolean answer = false;
		
		if(n==0 ) 
		{
			return false;
		}
		
		
		while(true)
		{
			if(n==1)
			{
				return true;
			}
			if(n%3 !=0)
			{
				return false;
			}
			n = n / 3;
		}
		
		
	}
}
