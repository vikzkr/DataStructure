package CircularQueue;

public class CircularQueueImpl {
	
	int topOfQueue;
	int beginingOfQueue;
	int arr[];
	int size;
	
	public CircularQueueImpl(int size)
	{
		this.arr = new int[size];
		this.topOfQueue=-1;
		this.size=size;
		this.beginingOfQueue=-1;
		System.out.println("Circular Queue Created "+size);
	}
	
	//isEmpty
	public Boolean isEmpty()
	{
		if(topOfQueue==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//isFull
	public Boolean isFull()
	{
		if(topOfQueue+1==beginingOfQueue)
		{
			return true;
		}
		else if(beginingOfQueue==0 && topOfQueue+1==size)
		{
			return true;
		}
		else
		{
			 return false;
		}
	}

	//enqueue
	public void enQueue(int data)
	{
		if(isFull())
		{
			System.out.println("Circular Queue is Full");
			return;
		}
		else if(isEmpty())
		{
			beginingOfQueue = 0;
			topOfQueue++;
			arr[topOfQueue]=data;
			System.out.println("Data inserted in Circular Queue is "+data);
		}
		else
		{
			if(topOfQueue+1==size)
			{
				topOfQueue=0;
			}
			else
			{
				topOfQueue++;
			}
			arr[topOfQueue]=data;
			System.out.println("Data inserted in  Circular Queue is "+data);
		}
	}
	
	//deque
	public int deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Circular Queue is Empty");
			return -1;
		}
		else
		{
			int val = arr[beginingOfQueue];
			arr[beginingOfQueue]=Integer.MIN_VALUE;
			if(beginingOfQueue == topOfQueue)
			{
				beginingOfQueue=topOfQueue=-1;
			}
			else if(beginingOfQueue+1==size)
			{
				beginingOfQueue=0;
			}
			else
			{
				beginingOfQueue++;
			}
			
			return val;
		}
	}
	
	//peek
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Circular Queue is Empty");
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
			System.out.println(" Circular Queue Deleted");
		}
}
