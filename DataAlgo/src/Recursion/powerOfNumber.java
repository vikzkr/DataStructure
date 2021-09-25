package Recursion;

public class powerOfNumber {
	
	
	public static void main(String[] args) {
		
		System.out.println(powerofNumber(2,3));
	}

	private static int powerofNumber(int i, int j) {
		
		if(j==0)
		{
			return 1;
		}
	return i* powerofNumber(i, j-1);	
	}

}
