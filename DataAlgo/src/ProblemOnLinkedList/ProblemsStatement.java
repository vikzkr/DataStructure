package ProblemOnLinkedList;

import java.util.HashSet;

public class ProblemsStatement {
	
	//Delete Duplicate from linked list
	public void deleteDups(LinkedList ll) {
	    HashSet<Integer> hs = new HashSet();
	    Node tempnode = ll.head;
	    Node prev = null;
	    while(tempnode!=null)
	    {
	    	int val= tempnode.value;
	    	if(hs.contains(val))
	    	{
	    		prev.next=tempnode.next;
	    		ll.size--;
	    	}
	    	else
	    	{
	    		hs.add(val);
		    	prev=tempnode;
	    	}

	    	tempnode= tempnode.next;
	    }
	   
	  }
	
	//Nth to the Last Element 
	public Node nLastLinkedList(LinkedList ll, int location)
	{
		Node p=ll.head;
		Node q = ll.head;
		for(int i=0;i<location;i++)
		{
			if(q==null)
			{
				return null;
			}
			q=q.next;
		}
		while(q!=null)
		{
			p=p.next;
			q=q.next;
		}
		
		return p;
	}
}
