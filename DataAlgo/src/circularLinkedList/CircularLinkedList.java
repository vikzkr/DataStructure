package circularLinkedList;

public class CircularLinkedList
{
		public Node head;
		public Node tail;
		public int size;
		
		
		public Node createCircularSingleLinkedList(int nodevalue)
		{
			Node node = new Node();
			node.data=nodevalue;
			node.next=node;
			head=node;
			tail=node;
			size=1;
			return head;
		}
		
		public void insertIntoCircularLinkedList(int nodevalue,int location)
		{
			Node node = new Node();
			node.data=nodevalue;
			if(head== null)
			{
				createCircularSingleLinkedList(nodevalue);
				return;
			}
			else if(location==0)
			{
				node.next=head;
				head=node;
				tail.next=node;
			}
			else if(location>=size)
			{
				node.next=tail.next;
				tail.next=node;
				tail=node;
				
			}
			else
			{
				Node tempnode=head;
				int index = 0;
				while(index<location-1)
				{
					tempnode=tempnode.next;
					index++;
				}
				node.next= tempnode.next;
				tempnode.next=node;
			}
			size++;
		}
		
		public void traverseCircularLinkedList()
		{
			if(head!=null)
			{
				Node temp=head;
				for(int i=0;i<size;i++)
				{
					System.out.print(temp.data);
					 if(i!=size-1)
					  {
						  System.out.print("-->");
					  }
					 temp=temp.next;
				}
			}
			 System.out.println("\n");
		}
		
		public boolean searchNode(int data)
		{
			if(head!=null)
			{
				Node temp=head;
				for(int i=0;i<size;i++)
				{
					if(temp.data==data)
					{
						System.out.println("value found at node "+i);
						return true;
					}
					temp=temp.next;
				}
			}
			System.out.println("Node Not found");
			return false;
		}
		
		public void  deleteNode(int location)
		{
					if(head==null)
					{
						 System.out.println("The CircularLinkedList does not exist! ");
					      return;
					}
					else if(location ==0)
					{
						head=head.next;
						tail.next=head;
						size--;
						if(size==0)
						{
							tail = null;
					        head.next = null;
					        head = null;
						}
					}
					else if(location>=size)
					{
						Node temp =head;
						for(int i=0;i<size-1;i++)
						{
							temp=temp.next;
						}
						if(temp==head)
						{
							 head.next = null;
						        tail = head = null;
						        size--;
							return;
						}
						temp.next=head;
						tail=temp;
						size--;
					}
					
					else
					{
						Node temp =head;
						for(int i=0;i<location-1;i++)
						{
							temp=temp.next;
						}
						temp.next=temp.next.next;
						size--;
					}
					
		}
		
		  public void deleteCircularLinkedList() {
			    if (head == null) {
			      System.out.println("CircularLinkedList does not exist!");
			    } else {
			      head = null;
			      tail.next = null;
			      tail = null;
			      System.out.println("CircularLinkedList has been deleted!");
			    }
			  }
}
