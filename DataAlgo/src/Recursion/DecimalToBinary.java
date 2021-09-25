package Recursion;
/*
 @Author Vikas
*/

public class DecimalToBinary {
	public static void main(String[] args) {
		System.out.println(decimalTOBinary(13));
	}
	private static int decimalTOBinary(int i) {
		if(i==0)
		{
			return 0;
		}
		return i%2+10*decimalTOBinary(i/2);
	}
}
