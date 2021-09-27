package Array;
/*
@Author Vikas
*/
public class pairTwoSum {
	
	public static void main(String[] args) {
		
		
		int arr[]= {2,6,3,9,11};
		int target = 9;
		twoSums(arr,target);
	}

	private static void twoSums(int[] arr, int target) {
		
		for(int i =0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(i+" "+j+ " i.e "+ arr[i]+" "+arr[j]);
				}
			}
		}
		
	}

}
