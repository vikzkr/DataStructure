package Recursion;
/*
@Author Vikas
*/

public class GCD {
	public static void main(String[] args) {
		System.out.println(	gcd(48,18));
	}
	private static int gcd(int i, int j) {
		if(j==0)
		{
			return i;
		}
		return gcd(j,i%j);
	}
}
