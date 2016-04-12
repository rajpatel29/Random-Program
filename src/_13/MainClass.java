package _13;

//binary to decimal
public class MainClass 
{
	public static void main(String args[])
	{
		System.out.println("Decimal " + findPrime(1010));
	}
	
	public static int findPrime(int n)
	{
		int answer = 0;
		
		int mul = 0;
		int t2 = n%10;
		int t1 = n/10;
		while(t1 != 0)
		{
			answer +=  Math.pow(2, mul) * t2;
			
			t2 = t1 % 10;
			t1 = t1 /10 ;
			mul++;
		}
		
		answer +=  Math.pow(2, mul) * t2;
		
		return answer;
	}
}
