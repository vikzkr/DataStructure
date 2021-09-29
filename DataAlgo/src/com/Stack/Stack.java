 package com.Stack;

public class Stack {
	
	int arr[];
	int topofStack;
	
	public Stack(int size)
	{
		arr = new int[size];
		topofStack = -1;
		System.out.println("Stack created with size of "+size);
	}
	
	public Boolean isEmpty()
	{
		if(topofStack==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Boolean isFull()
	{
		if(topofStack==arr.length-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void push(int data)
	{
		if(isFull())
		{
			System.out.println("Stack is Full");
		}
		else
		{
			arr[topofStack+1]=data;
			topofStack++;
		}
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		else
		{
			int top = arr[topofStack];
			topofStack--;
			return top;
		}
		
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return -1;
		}else
		{
			int top = arr[topofStack];
			return top;
		}
	}
	
	public void deleteStack()
	{
		arr = null;
		System.out.println("Stack deleted");
	}
}
