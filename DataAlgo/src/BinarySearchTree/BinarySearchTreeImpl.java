package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;


public class BinarySearchTreeImpl {
	
	public Binarynode root;

	public BinarySearchTreeImpl() {
		this.root=null;
	}
	
	//Insert into Binary Search tree
	public Binarynode insertIntoBST(Binarynode currentnode,int data)
	{		
		if(currentnode==null)
		{
			Binarynode node = new Binarynode();
			node.data=data;
			System.out.println("BST with root"+data);
			return node;
		}
		else if(data<=currentnode.data)
		{
			currentnode.left = insertIntoBST(currentnode.left, data);
			return currentnode;
		}
		else 
		{
			currentnode.right = insertIntoBST(currentnode.right, data);
			return currentnode;
		}
	}
	
	//Alernative Inser 
	public void insertA(Binarynode root,int data)
	{
				
		if(root==null)
		{
			Binarynode node = new Binarynode();
			node.data=data;
			root=node;
			return ;
		}
		 if(root.data>=data)
		{
			if(root.left==null)
			{
			Binarynode node = new Binarynode();
				node.data=data;
				root.left=node;
				return  ;
			}
			insertIntoBST(root.left, data);
			
		}
		 
		 if(root.data<=data)
		 {

				if(root.right==null)
				{
					Binarynode node = new Binarynode();
					node.data=data;
					root.right=node;
					return ;
				} 
				
				insertIntoBST(root.right, data);
		 }
		
	}

	//insert
	public void insert(int data)
	{
		root = insertIntoBST(root, data);
		//insertA(root, data);
	}
	
	//preOrder
	public void preOrder(Binarynode root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+ " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	//InORder
		public void inOrder(Binarynode root)
		{
			if(root==null)
			{
				return;
			}
			
			inOrder(root.left);
			System.out.println(root.data+ " ");
			inOrder(root.right);
		}
		
		//PostORder
		public void PostOrder(Binarynode root)
		{
			if(root==null)
			{
				return;
			}
			
			PostOrder(root.left);
			
			PostOrder(root.right);
			System.out.println(root.data+ " ");
		}
		
		//level order
		public void levelOrder()
		{
			Queue<Binarynode> queue = new LinkedList<Binarynode>();
			queue.add(root);
			while(!queue.isEmpty())
			{
				Binarynode presentnode=queue.remove();
				System.out.print(presentnode.data+" ");
				if(presentnode.left!=null)
				{
					queue.add(presentnode.left);
				}
				if(presentnode.right!=null)
				{
					queue.add(presentnode.right);
				}
			}
		}
		
		//search
		public Binarynode search(Binarynode node,int val)
		{
			if(node==null)
			{
				System.out.println("data present in bst");
				return null;
			}
			else if(node.data==val)
			{
				System.out.println("data present in bst");
				return node;
			}
			else if(val<node.data)
			{
				return search(node.left, val);
			}
			else 
			{
				return search(node.right, val);
			}
			
		}
		 // Minimum node
		  public static Binarynode minimumNode(Binarynode root) {
		    if (root.left == null) {
		      return root;
		    } else {
		      return minimumNode(root.left);
		    }
		  }

		  // Delete node
		  public Binarynode deleteNode(Binarynode root, int data) {
		    if (root == null) {
		      System.out.println("data not found in BST");
		      return null;
		    }
		    if (data < root.data) {
		      root.left = deleteNode(root.left, data);
		    } else if (data > root.data) {
		      root.right = deleteNode(root.right, data);
		    } else {
		      if (root.left != null && root.right != null) {
		        Binarynode temp = root;
		        Binarynode minNodeForRight = minimumNode(temp.right);
		        root.data = minNodeForRight.data;
		        root.right = deleteNode(root.right, minNodeForRight.data);
		      } else if (root.left != null) {
		        root = root.left;
		      } else if (root.right != null) {
		        root = root.right;
		      } else {
		        root = null;
		      }
		    }

		    return root;

		  }

		  public void deleteBST() {
		    root = null;
		    System.out.println("BST has been deleted successfully");
		  }


}
