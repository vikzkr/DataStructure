package ProblemOnStack;


//Question 
//how to design a stack which in addition to push and pop has a min function that return minimum value , will all operation
//time complexity as O(1)
public class StackQuestion {
	
	Node top;
	Node min;
	
	public StackQuestion()
	{
		top=min=null;
	}
	
	public void push(int data)
	{
		
		if(min==null)
		{
			min = new Node(data,min);
		}
		else if(min.value>data)
		{
			
			min = new Node(data,min);
		}
		else
		{
			min= new Node(min.value,min);
		}
		
		top = new Node(data, top);
	}
	
	public int min()
	{
		return min.value;
	}
	
	public int pop()
	{
		min=min.next;
		int val= top.value;
		top=top.next;
		return val;
	}
	

}
