package _21;

//Write a function that takes a string as input and returns the string reversed.

public class MainClass
{
	public static void main(String args[])
	{
		System.out.println(reverseString("Hello"));
	}
	
	public static String reverseString(String s) 
    {
       String answer = "";
       
       char[] charA = s.toCharArray();
       char[] charB = new char[s.length()];
       int j = 0;
       for (int i = charA.length - 1; i >= 0 ; i--) 
       {
    	   
    	   charB[j] = charA[i];
    			   j++;
       }
       
       answer = new String(charB);
       return answer;
    }
}
