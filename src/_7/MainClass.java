package _7;

//A perfect number is a positive integer that is equal to the sum of its proper positive divisors, that is, 
//the sum of its positive divisors excluding the number itself. Equivalently, a perfect number is a number that is half
//the sum of all of its positive divisors. The first perfect number is 6, because 1, 2 and 3 are its proper 
//positive divisors, and 1 + 2 + 3 = 6. Equivalently, the number 6 is equal to half the sum of all its positive divisors: 
//( 1 + 2 + 3 + 6 ) / 2 = 6. 

public class MainClass 
{
	public static void main(String args[])
	{
		int n  = 27;
		boolean check = isPerfect(n);
		System.out.println("Answer " + check);
	}

	private static boolean isPerfect(int n) 
	{
		boolean result = false;
		
		int temp = 0;
		for(int i = 1 ; i <= n/2  ; i++)
		{
			if((n%i) == 0)
			{
				temp += i;
			}
		}
		
		if(temp == n)
		{
			result = true;
		}
		
		
		return result;
	}
}
