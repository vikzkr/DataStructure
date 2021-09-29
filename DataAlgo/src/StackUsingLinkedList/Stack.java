package StackUsingLinkedList;

public class Stack {
	
	SingleLinkedList sll = new SingleLinkedList();
	
	
	public void  push(int data)
	{
		sll.insertInLinkedList(data, 0);
		 System.out.println("Inserted " + data + " in Stack");
	}
	
	public Boolean isEmpty()
	{
		if(sll.head==null)
		{
			return true;
		}
		else
		{
			return false;
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
			int val= sll.head.data;
			sll.deletionOfNode(0);
			return val;
		}
		
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		else
		{
			int val= sll.head.data;
			return val;
		}
	}
	
	public void deleteStack()
	{
		sll.head =null;
		System.out.println("Stack deleted");
	}

}
