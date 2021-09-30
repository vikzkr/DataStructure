package BinaryTreeUsingLL;

import java.util.LinkedList;
import java.util.Queue;


public class BinaryTreeUsingLinkedList {
	
	BinaryNode root;
	
	public BinaryTreeUsingLinkedList()
	{
		this.root=null;
	}
	
	//PreOrder Traversal
	public void preOrder(BinaryNode node)
	{
		if(node==null)
		{
			
			return;
		}
		System.out.println(node.value);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	//InOrder Traversal
	public void inOrder(BinaryNode node)
	{
		if(node==null)
		{
			return;
		}
		inOrder(node.left);
		System.out.println(node.value);
		inOrder(node.right);
	}
	
	//Post Order Traversal
	public void postOrder(BinaryNode node)
	{
		if(node==null)
		{
			return;
		}
	postOrder(node.left);
	postOrder(node.right);
	System.out.println(node.value);
	}
	
	//level ORder
		public void levelOrder()
		{
			Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
			queue.add(root);
			while(!queue.isEmpty())
			{
				BinaryNode node= queue.remove();
				System.out.print(node.value+ " ");
				if(node.left!=null)
				{
					queue.add(node.left);
				}
				
				if(node.right!=null)
				{
					queue.add(node.right);
				}
			}
			
		}
		
		//searching value in queue
		public void searchNodeValue(String data)
		{
			Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
			queue.add(root);
			while(!queue.isEmpty())
			{
				BinaryNode presentNode = queue.remove();
				if(presentNode.value==data)
				{
					System.out.println("value found"+data);
					return;
				}
				else
				{
					if(presentNode.left!=null)
					{
						queue.add(presentNode.left);
					}
					if(presentNode.right!=null)
					{
						queue.add(presentNode.right);
					}
						
				}
			}
			System.out.println("value Not found"+data);
			
		}
		
		//Insert new node
		public void insertNewNode(String val)
		{
			BinaryNode newnode = new BinaryNode();
			newnode.value=val;
			if(root==null)
			{
				root = newnode;
				System.out.println("Node created");
				return;
			}
			else
			{
				Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
				queue.add(root);
				while(!queue.isEmpty())
				{
					BinaryNode node = queue.remove();
					if(node.left==null)
					{
						node.left = newnode;
						break;
					}
					else if(node.right==null)
					{
						node.right=newnode;
						break;
					}
					else
					{
						queue.add(node.left);
						queue.add(node.right);
					}
					
					
				}
			}
		}
		
	
	//Get DepestNode
		public BinaryNode GetDeepestNode()
		{
			Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
			queue.add(root);
			BinaryNode presentNode=null;
			while(!queue.isEmpty())
			{
				presentNode =queue.remove();
				if(presentNode.left!=null)
				{
					queue.add(presentNode.left);
				}
				if(presentNode.right!=null)
				{
					queue.add(presentNode.right);
				}
			}
			return presentNode;
		}
		
	//DeleteDepestNode
		public void deleteDepestNode()
		{
			Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
			queue.add(root);
			BinaryNode presentNode=null;
			BinaryNode previousNode=null;
			while(!queue.isEmpty())
			{
				previousNode = presentNode;
				presentNode=queue.remove();
				if(presentNode.left==null)
				{
					previousNode.right=null;
					return;
				}
				else if(presentNode.right==null)
				{
					previousNode.left=null;
					return;
				}
				
				
					queue.add(presentNode.left);
					queue.add(presentNode.right);
				}
			
		}
		
		//Delete Node
		public void deleteNode(String data)
		{
			Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
			queue.add(root);
			BinaryNode presentNode=null;
			while(!queue.isEmpty())
			{
				presentNode=queue.remove();
				if(presentNode.value==data)
				{
					presentNode.value = GetDeepestNode().value;
					deleteDepestNode();
					System.out.println("Note deleted");
					return;
					
				}
				else 
				{
					if(presentNode.left!=null)
					{
						queue.add(presentNode.left);
					}
					if(presentNode.right!=null)
					{
						queue.add(presentNode.right);
					}
				}
					
				
			}
		}
		
		 // Delete Binary Tree
		  void deleteBT() {
		    root = null;
		    System.out.println("BT has been successfully deleted!");
		  }
			
}
