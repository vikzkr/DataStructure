package Miscellanous;


public class arabicNumber {
	
	 
	public static void main(String[] args) {
		 int another =1;
		 int Othernumber = 1;
		String x =reverse(222);
		int i =Integer.valueOf(x);
		System.out.println(i);
		int actualSum= i+Othernumber;
		
		System.out.println(actualSum);
		String val =reverse(actualSum);	
		System.out.println(val);
		
		
		
	}
	
	static String reverse(int x)
	{
		String sum="";
		int remainder;
		int number = x;
		while(number!=0)
		{
			 remainder = number%10;
			sum=sum +remainder;
			number=number/10;
			
		}
		return sum;
	}

}
