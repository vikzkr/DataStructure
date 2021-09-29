package Queue;

public class Queue {
	
	int topofQueue;
	int beginingOfQueue;
	int arr[];
	
	public Queue(int size)
	{
		arr = new int[size];
		topofQueue=-1;
		beginingOfQueue=-1;
		System.out.println("Queue created with size of "+size);	
	}
	
	//checking queue isEmpty
	public Boolean isEmpty()
	{
		if((beginingOfQueue==-1)||(beginingOfQueue==arr.length-1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//checking queue isFull
	public Boolean isFull()
	{
		if(topofQueue==arr.length-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Insert
	public void enQueue(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is Full");
		}
		
		else if(isEmpty())
		{
			beginingOfQueue=0;
			topofQueue++;
			arr[topofQueue]=data;
			System.out.println("Data inserted in Queue is "+data);
		}
		else
		{
			topofQueue++;
			arr[topofQueue]=data;
			System.out.println("Data inserted in Queue is "+data);
		}
	}
	
	//returning top of element and  deleting it
	public int deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		else
		{
			int val = arr[beginingOfQueue];
			beginingOfQueue++;
			if(beginingOfQueue>topofQueue)
			{
				beginingOfQueue=-1;
				topofQueue=-1;
			}
			return val;
			
		}
	}
	
	//returning top of element without deleting it
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		else
		{
			int val = arr[beginingOfQueue];
			return val;
		}
	}
	
	//delete entire Queue
	public  void deleteQueue()
	{
		arr=null;
		System.out.println("Queue Deleted");
	}
}
