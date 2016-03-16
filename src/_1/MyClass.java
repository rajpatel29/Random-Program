package _1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//You have got a range of numbers between 1 to N, where one of the number is repeated.
//You need to write a program to find out the duplicate number. 
class MyClass
{
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < 30; i++) 
		{
			list.add(i);
		}
		list.add(15);

		FindDuplicateClass duplicatClass = new FindDuplicateClass();
		
		int n = list.size() - 1;
		int duplicate = duplicatClass.findSum(list) - duplicatClass.findTotal(n);
		System.out.println("Result = " + duplicate);
	}
}

class FindDuplicateClass
{
	public int findTotal(int n)
	{
		int total = 0;
		for(int i = 1 ; i <= n ; i++)
		{
			total  += i;
		}
		return total;
	}
	
	public int findSum(List<Integer> list)
	{
		int sum = 0;
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext())
		{
			sum = sum + iterator.next();
		}
		return sum;
	}
}




