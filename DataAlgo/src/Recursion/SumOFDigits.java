package Recursion;
/*
@Author Vikas
*/

public class SumOFDigits {
	public static void main(String[] args) {
		System.out.println(sumOfDigits(111));
	}
	private static int sumOfDigits(int i) {
		if(i==0 || i<0) {
			return i;
		}
		return i%10+sumOfDigits(i/10);
	}
}
