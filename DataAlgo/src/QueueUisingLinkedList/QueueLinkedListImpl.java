package QueueUisingLinkedList;

public class QueueLinkedListImpl
{
	SingleLinkedList sll = new SingleLinkedList();
	
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
	
	public void enQueue(int data)
	{
		if(isEmpty())
		{
			sll.insertInLinkedList(data, sll.size);
			System.out.println("Data inserted in Queue "+data);
		}
	}
	
	public int deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty ");
			return -1;
		}
		else
		{
			int val = sll.head.data;
			sll.deletionOfNode(0);
			return val;
		}
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty ");
			return -1;
		}
		else
		{
			int val = sll.head.data;
			return val;
		}
	}
	
	public void deleteQueue()
	{
		sll.head =null;
		System.out.println("Queue deleted");
	}

}
