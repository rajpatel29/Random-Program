package _12;

public class MainClass
{
	public static void main(String args[])
	{
		findPrime(500);
	}
	
	public static void findPrime(int n)
	{
		for (int i = 2; i < n; i++) 
		{
			boolean isPrime = false;
			for (int j = 2 ; j <= i/2; j++)
			{
				if(i % j == 0)
				{
					isPrime = true;
				}
			}
			if(!isPrime)
			{
				System.out.println(i + " is Prime");
			}
		}
	}
}
