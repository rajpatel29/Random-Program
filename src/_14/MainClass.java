package _14;

//decimal to binary
public class MainClass 
{
	public static void main(String args[])
	{
		System.out.println("Binary " + findBinary(500));
	}
	public static String findBinary(int n)
	{
		String answer = "";
		
		int t1=n ,t2;
		while(t1>1)
		{
			t2 = t1 %2;
			t1 = t1/2;
			
			if(t2 == 0)
			{
				answer = "0" + answer;
			}
			else
			{
				answer = "1" + answer;
			}
			
		}
		if(t1 == 0)
		{
			answer = "0" + answer;
		}
		else
		{
			answer = "1" + answer;
		}
		
		
		return answer;
	}
}
