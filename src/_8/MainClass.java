package _8;


//fibonacci sequence
public class MainClass 
{
	public static void main(String args[])
	{
		int n = 4;
		findFibbo(n);
	}

	private static void findFibbo(int n) 
	{
		int a = 0;
		int b = 1;
		int t;
		
		for(int i = 0 ; i < n ; i++)
		{
			if(i == 0 )
			{
				System.out.print(a + " ");
			}
			else if(i == 1)
			{
				System.out.print(b + " ");
			}
			else
			{
				t = a + b;
				System.out.print(  t + " " );
				a = b;
				b = t;
			}
		}
	}
}
