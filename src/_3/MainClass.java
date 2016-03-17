package _3;

//Write a program to reverse a string using recursive methods. 
//You should not use any string reverse methods to do this.
public class MainClass
{
	public static void main(String args[])
	{
		String str = findReverse("Hithere123");
		System.out.println("Answer : " + str);
	}

	private static String findReverse(String string) 
	{
		if(string.equals(""))
			return "";
		else
			return findReverse(string.substring(1)) + string.charAt(0);
	}
}
