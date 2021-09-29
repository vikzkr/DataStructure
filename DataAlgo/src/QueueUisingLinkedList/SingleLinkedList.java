package QueueUisingLinkedList;
/*
@Author Vikas
*/
public class SingleLinkedList {
	
	public Node head;
	public Node tail;
	public int size;
	
	public Node createSingleLinkedList(int nodevalue)
	{
		head = new Node();
		Node node = new Node();
		node.next=null;
		node.data=nodevalue;
		head = node;
		tail = node;
		size =1;
		return head;
		
	}
	
	//Insert Method SingleLinkedList
	public void insertInLinkedList(int nodevalue,int location)
	{
		Node node = new Node();
		node.data = nodevalue;
		if(head==null)
		{
			createSingleLinkedList(nodevalue);
			return;
		}
		else if(location==0)
		{
			node.next=head;
			head=node;
		}
		else if(location>=size)
		{
			node.next=null;
			tail.next=node;
			tail=node;
		}
		else
		{
			Node tempNode = head;
			int index = 0;
			while(index<location-1)
			{
				tempNode = tempNode.next;
				index++;
			}
			Node nextnode=tempNode.next;
			tempNode.next= node;
			node.next =nextnode;	
			
		}
		size++;
	}
	
	//SingleLinkedList Traversal
	public void traverseLinkedList()
	{
	  if(head==null)
	  {
		  System.out.println("Single Linked is Empty");
	  }
	  else
	  {
		  Node tempnode= head;
		  for(int i=0;i<size;i++)
		  {
			  System.out.print(tempnode.data);
			  if(i!=size-1)
			  {
				  System.out.print("-->");
			  }
			  tempnode=tempnode.next;
		  }
	  }
	  
	  System.out.println("\n");
	}

	
	//SingleLinkedList Traversal
	public boolean searchNode(int nodevalue)
	{
		if(head!=null)
		{
			Node tempnode=head;
			for(int i=0;i<size;i++)
			{
				if(tempnode.data==nodevalue)
				{
					System.out.println("Found node at location "+i);
					return true;
				}
				tempnode=tempnode.next;
				
			}
		}
		System.out.println("Node Not found");
		return false;
	}
	
	
	//Delete operation in SingleLinkedList
	public void deletionOfNode(int location)
	{
		if(head==null)
		{
			System.out.println("No element is LL");
			return;
		}
		else if(location==0)
		{
			head=head.next;
			size--;
			if(size==0)
			{
				tail=null;
			}
		}
		else if(location>=size)
		{
			Node tempnode=head;
			for(int i =0; i<size-1;i++)
			{
				tempnode=tempnode.next;
			}
			if(tempnode==head)
			{
				head=tail=null;
				size--;
				return;
			}
			tempnode.next=null;
			tail=tempnode;
			size--;
		}
		else
		{
			Node tempnode=head;
			for(int i =0; i<location-1;i++)
			{
				tempnode=tempnode.next;
			}
			tempnode.next=tempnode.next.next;
			size--;
		}
	}
	
	//Delete Entire node in SingleLinkedList
	
	public void deleteSingleLinkedList()
	{
	head=tail=null;	
	System.out.println("The SLL deleted successfully");
	}
	
}
