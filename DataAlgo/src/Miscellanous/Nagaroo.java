package Miscellanous;

import java.util.stream.IntStream;

public class Nagaroo {
	
	public static void main(String[] args) {
		
		String s= "this_is_life";
		char ch= '_';
		StringBuffer word = new StringBuffer(s);
		int[] indexes = IntStream.range(0, word.length())
		        .filter(i -> word.charAt(i) == ch).toArray();
		
		System.out.println(indexes.length);
		
		for(int a:indexes)
		{
			  char re = Character.toUpperCase(word.charAt(a+1));
			   System.out.println(re);
			   word.setCharAt(a+1, re);
			   word.setCharAt(a, ' ');
			   	
		}
		
		System.out.println(word);
		
	}

}
