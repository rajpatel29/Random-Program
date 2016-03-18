package _11;

import java.util.Scanner;
import java.util.Stack;

//How to sort a Stack using a temporary Stack?

public class MainClass 
{
	public static void main(String args[])
	{
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(3);
		stack.push(1);
		stack.push(2);
		stack.push(45);
		stack.push(23);
		stack.push(33);
		
		Stack<Integer> sortedStack = sortStack(stack);
		
		int end = sortedStack.size();
		System.out.println();
		System.out.println();
		
		System.out.println("After sorting ");
		for(int i = 0 ; i < end ; i++)
		{
			System.out.print(sortedStack.pop() + " ");
		}
	}
	
	private static Stack<Integer> sortStack(Stack<Integer> stack)
	{
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> result =new Stack<Integer>();
		
		int temp;
		int temp1 , temp2;
		while(!stack.empty())
		{
			if(result.empty())
			{
				temp = stack.pop();
				result.push(temp);
			}
			else
			{
				temp1 = result.pop();
				temp2 = stack.pop();
				
				if(temp2 < temp1)
				{
					result.push(temp1);
					result.push(temp2);
				}
				else
				{
					stack.push(temp1);
					stack.push(temp2);
				}
			}
//			scanner.nextLine();
		}
		
		return result;
	}
}
