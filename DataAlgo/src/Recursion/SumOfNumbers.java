package Recursion;

public class SumOfNumbers {
	
	public static void main(String[] args) {
		System.out.println(sumofNumber(5));
	}

	private static int sumofNumber(int i) {
	if(i<0)
	{
		return 0;
	}
	
	if(i==1 || i==0)
	{
		return 1;
	}
	
		return i+ sumofNumber(i-1);
	
		
	}

}
