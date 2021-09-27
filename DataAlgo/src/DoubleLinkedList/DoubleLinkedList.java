package DoubleLinkedList;

import circularLinkedList.Node;

public class DoubleLinkedList {
	
	Node head;
	Node tail;
	int size;
	public Node createDoubleLinkedList(int nodevalue)
	{
		
			Node node =new Node();
			node.data=nodevalue;
			node.next=null;
			node.prev=null;
			head=node;
			tail=node;
			size=1;
			return node;
		
		
	}
	
	public void insertIntoDoubleLinkedList(int nodevalue,int location)
	{
		Node node = new Node();
		node.data=nodevalue;
		if(head==null)
		{
			createDoubleLinkedList(nodevalue);
			return;
		}
		else if(location==0)
		{
			node.next=head;
			node.prev=null;
			head.prev=node;
			head=node;
			
		}
		else if(location>=size)
		{
			node.next=null;
			tail.next=node;
			node.prev=tail;
			tail=node;
		}
		else
		{
			Node tempnode=head;
			int index=0;
			while(index<location-1)
			{
				tempnode=tempnode.next;
				index++;
			}
			node.prev=tempnode;
			node.next=tempnode.next;
			tempnode.next=node;
			tempnode.next.prev=node;
			
		}
		size++;
	}
	
	public  void traverDoubleLinkedList()
	{
		if(head!=null)
		{
			Node tempnode=head;
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
	
	public  void reverseTraverseDouble()
	{
		Node tempnode=tail;
		for(int i=0;i<size;i++)
		{
			System.out.print(tempnode.data);
			if(i!=size-1)
			{
				System.out.print("-->");
			}
			tempnode=tempnode.prev;
		}
		 System.out.println("\n");
	}
	
	public boolean searchNode(int data)
	{
		if(head!=null)
		{
			Node tempnode=head;
			for(int i=0;i<size;i++)	
			{
				if(tempnode.data==data)
				{
					System.out.println("value found at "+i);
					return true;
				}
				tempnode=tempnode.next;
			}
		}
		return false;
	}
	
	public void deleteNodeFromDoubleLinkedList(int location)
	{
		if(head==null)
		{
			System.out.println("No element present in DoubleLinkedList");
			return;
		}
		else if(location==0)
		{
			head=head.next;
			head.prev=null;
			size--;
			if(size==0)
			{
				head=tail=null;
			}
			
		
		}
		else if(location>=size)
		{
			Node tempnode=tail.prev;
			if(size==1)
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
			Node tempnode= head;
			for(int i= 0;i<location-1;i++)
			{
				tempnode=tempnode.next;
			}
			tempnode.next= tempnode.next.next;
			tempnode.next.prev=tempnode;
			size--;
			
		}
	}
	
	 // Delete entire DLL
	  public void deleteDLL() {
	    Node tempNode = head;
	    for (int i =0; i< size; i++) {
	      tempNode.prev = null;
	      tempNode = tempNode.next;
	    }
	    head = null;
	    tail = null;
	    System.out.println("The DoubleLinkedList has been deleted!");
	  }

}
