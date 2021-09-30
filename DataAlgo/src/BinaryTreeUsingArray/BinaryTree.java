package BinaryTreeUsingArray;

public class BinaryTree {

	String[] arr;
	int LastUsedIndex;
	
	
	public BinaryTree(int size) {
		arr= new String[size+1];
		this.LastUsedIndex=0;
		System.out.println("Blank tree of size "+size +" have been created");

	}
	
	//is FUll
	public boolean isFull()
	{
		if(LastUsedIndex==arr.length-1)
		{
			return true;
		}
		return false;
	}
	
	//Insert value
	public void insertIntoTree(String value)
	{
		if(!isFull())
		{
			arr[LastUsedIndex+1]=value;
			LastUsedIndex++;
			System.out.println("value successfully inserted");
		}
		else
		{
			System.out.println("Tree is full");
		}
	}
	
	//PreOrder traversal
	public void preOrder(int index)
	{
		if(index>LastUsedIndex)
		{
			return;
		}
		System.out.print(arr[index]+ " ");
		preOrder(2*index);
		preOrder(2*index+1);
	}
	
	//In Order
	public void inOrder(int index)
	{
		if(index>LastUsedIndex)
		{
			return;
		}
		
		inOrder(2*index);
		System.out.print(arr[index]+ " ");
		inOrder(2*index+1);
	}
	
	//postOrder
	public void postOrder(int index)
	{
		if(index>LastUsedIndex)
		{
			return ;
		}
		
		postOrder(2*index);
		postOrder(2*index+1);
		System.out.print(arr[index]+ " ");
		
		
	}
	
	//level Order
	public void levelOrder()
	{
		for(int i =1;i<=LastUsedIndex;i++)
		{
			System.out.print(arr[i]+ " ");
			
		}
	}
	
	  // Search method
	  public int search(String value) {
	    for (int i = 1; i<=LastUsedIndex; i++) {
	      if (arr[i] == value) {
	        System.out.println(value+" exists at the location: " + i);
	        return i;
	      }
	    }
	    System.out.println("The value does not exist in BT");
	    return -1;
	  }
	  
	  public void deleteFromTree(String value)
	  {
		  int index = search(value);
		  if(index==-1)
		  {
			  System.out.println("The value does not exist in BT");  
		  }
		  else
		  {
			  arr[index]=arr[LastUsedIndex];
			 LastUsedIndex--;
			 System.out.println("Node successFully deleted");
		  }
	  }
	  

	  // Delete BT

	  public void deleteBT() {
	    try {
	      arr = null;
	      System.out.println("The BT has been successfully deleted");

	    } catch (Exception e){
	      System.out.println("There was an error deleting the tree");
	    }
	  }
}
