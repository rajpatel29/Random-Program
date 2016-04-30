package _23;

//Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.
//For num = 5 you should return [0,1,1,2,1,2].


public class MainClass 
{
	public static void main(String args[])
	{
		int answers[] = countBits(5);
		
	
	}
	 
	public static int[] countBits(int num) 
	{
		int[] answer = new int[num+1];
		
		for (int i = 0; i <= num; i++)
		{
			int temp = 0;
			
			int n = i;
				
			while(true)
			{
				if(n==1 || n==0)
				{
					break;
				}
				
				
				int t1 = n%2;
				int t2 = n/2;
				if(t1==1)
				{
					temp++;
				}
				n = t2;
				
			}
			if(n==1)
			{
				temp++;
			}
			
			answer[i] = temp; 
		}
		
		return answer;
    }
}
