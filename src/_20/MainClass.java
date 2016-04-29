package _20;

import java.util.ArrayList;



//Write a function that takes a string as input and reverse only the vowels of a string.

public class MainClass 
{
	public static void main(String args[])
	{
		String temp = "leetcode";
		

		
		System.out.println(reverseVowels(temp));
	}

	private static String reverseVowels(String temp) 
	{
		String answer = "";
		
		ArrayList<Character> list = new ArrayList<>();
		list.add('a');
		list.add('e');
		list.add('i');
		list.add('o');
		list.add('u');
		list.add('A');
		list.add('E');
		list.add('I');
		list.add('O');
		list.add('U');
		
		char[] charArray = temp.toCharArray();
		
		ArrayList<Character> tempo = new ArrayList<>();
		
		for(int i = 0 ; i < charArray.length ; i++)
		{
			if(list.contains( temp.charAt(i) ))
			{
				tempo.add(temp.charAt(i));
			}
		}
		
		for (int j = 0; j < charArray.length; j++) 
		{
			if(list.contains( temp.charAt(j) ))
			{
				int i = tempo.size() - 1;
				charArray[j] = tempo.remove(i);
			}

		}
		
		answer = new String(charArray);
		
		return answer;
	}
}
