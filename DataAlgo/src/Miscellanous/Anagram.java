package Miscellanous;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		
		
		boolean result = checkAnagram("Test","estT4");
		System.out.println(result);
		
		
	}

	private static boolean checkAnagram(String a, String b) {

		String first = a.toLowerCase();
		String second =	b.toLowerCase();
		char [] temp1 = first.toCharArray();
		char [] temp2 = second.toCharArray();
		
		Arrays.sort(temp1);
		Arrays.sort(temp2);
		
		if(temp1.length == temp2.length)
		{
					for(int i = 0;i<temp1.length;i++)
					{
						if(temp1[i]==temp2[i])
						{
							return true;
						}
						
						
					}
					return false;
		}
		else
		{
			return false;
		}
		
	}

}
