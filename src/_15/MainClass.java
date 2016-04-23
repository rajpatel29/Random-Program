package _15;

//Reverse a String Without using String API

public class MainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("Reverse of Hello is : " + reverseString("Hello"));
	}

	public static String reverseString(String str)
	{
		String rev = "";
		
		for (int i = 0; i < str.length(); i++) 
		{
			rev =  str.charAt(i) + rev;
		}
		
		return rev;
	}
}


