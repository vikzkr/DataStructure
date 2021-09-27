package Array;
/*
@Author Vikas
*/

import java.util.Scanner;

public class ArrayTemp {
	
	public static void main(String[] args) {
		
		System.out.println("How many day's Temprature ?");
		Scanner sc = new Scanner(System.in);
		int days= sc.nextInt();
		int arr[]= new int[days];
		int sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Day's "+i+" Temprature is");
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			
		}
		
		double average = sum/days;
		System.out.println("average is "+average);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>average)
			{
				count++;
			}
			
		}
		System.out.println("Above average Temprature is Day's "+count);
		
		sc.close();
	}

}
