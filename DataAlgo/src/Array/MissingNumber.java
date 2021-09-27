package Array;
/*
@Author Vikas
*/
import java.lang.reflect.Array;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,8,9,10};
		
		missingNumber(arr);
	}

	private static void missingNumber(int[] arr) {
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		int number=10;
		int sum2=number*(number+1)/2;
		System.out.println("Missing Element is "+(sum2-sum));
		
	}

}
