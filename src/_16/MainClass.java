package _16;

//Sorting the String without using String API

public class MainClass 
{
	public static void main(String[] args)
	{
		System.out.println("" + sortString("ebgca"));
	}
	
	public static String sortString(String str)
	{
		String sortStr = "";
		
		char [] chars = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) 
		{
			for(int j = i + 1 ; j < str.length() ; j++)
			{
				if(chars[i] > chars[j])
				{
					char temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}
			}
		}
		
		sortStr = new String(chars);
		
		return sortStr;
	}
}
