package Miscellanous;

import java.util.Iterator;

public class Stack {
	
	
	int arr [] = new int [7];
	int top =-1;
	void push(int data)
	{
		arr[++top]= data;
	}
	void show()
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	int pop()
	{
		int data;
		data=arr[top--];
		arr[top+1]=0;
	return	data;
		
	}
	public static void main(String[] args) {
		
		Stack stack= new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(3);
		stack.show();
		System.out.println(stack.pop());
		System.out.println("--------------");
		stack.show();
		 
		
	}

}
