package _19;

public class MainClass 
{
	public static void main(String args[])
	{
		System.out.println("" + (202 == reverseNumber(202)));
	}
	
	public static int reverseNumber(int num)
	{
		int answer = 0;
		
		while (num != 0)
		{
			int t1 = num % 10;
			int t2 = num /10;
			
			answer = (answer * 10) + t1;
			
			num = t2;
		}
		
		return answer;
	}
}
