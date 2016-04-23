package _18;

//Check String is palindrome or not?

public class MainClass 
{
	public static void main(String args[])
	{
		System.out.println("madam".equals(reverseString("madam")));
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
