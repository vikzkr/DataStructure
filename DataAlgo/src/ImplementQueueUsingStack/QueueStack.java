package ImplementQueueUsingStack;

import java.util.Stack;

//Implementing Queue using two stack
public class QueueStack {
	
	Stack<Integer> newest;
	Stack<Integer> oldest;
	
	public QueueStack()
	{
		newest =  new Stack<>();
		oldest =  new Stack<>();
	}
	
	public int size()
	{
		return newest.size()+oldest.size();
	}
	
	public void enQueue(int data)
	{
		oldest.push(data);
	}

	public void shift()
	{
		if(newest.isEmpty())
		{
			while(!oldest.isEmpty())
			{
				int val = oldest.pop();
				newest.push(val);
			}
			
		}
	}
	
	public int deQueue()
	{
		shift();
		int val= newest.pop();
		return val;
	}
}
