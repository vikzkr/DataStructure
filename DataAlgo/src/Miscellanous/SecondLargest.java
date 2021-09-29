package Miscellanous;

public class SecondLargest {
	
	public static void main(String[] args) {
		
		int arr[] = {5,6,7,2,1};
		
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		
		
		for(int i = 0; i<arr.length-1;i++)
		{
			if(arr[i]>largest)
			{
				secondlargest = largest;
				largest=arr[i];
				
			}
			else if(secondlargest<arr[i]  && arr[i]!=largest)
			{
				secondlargest=arr[i];
			}
		}
		System.out.println(secondlargest);
	}

}
