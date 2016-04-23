package _17;

import java.util.Arrays;

//Sort the String with using String API?

public class MainClass 
{
	public static void main(String args[])
	{
		System.out.println("" + sortString("ghbca"));
	}
	
	public static String sortString(String str)
	{
		String answer = "";
		
		char[] chars = str.toCharArray();
		
		Arrays.sort(chars);
		
		answer = new String(chars);
		
		return answer;
	}
}
