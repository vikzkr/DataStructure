package Miscellanous;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ListArraySubstring {
	
	public static void main(String[] args) {
				
		List<String> st1= Arrays.asList("ab","cd","ed");
		List<String> st2= Arrays.asList("ac","hi","jk");
		for(int i=0;i<st1.size();i++)
		{
			checkEqualsubstring(st1.get(i),st2.get(i));
		}
	
	}

	private static void checkEqualsubstring(String string, String string2) {
		String s1=string;
		String s2=string2;
		char[] s1arr=s1.toCharArray();
		char[] s2arr=s2.toCharArray();
		int count = 0;
		HashSet<Character> h1 = new HashSet<Character>();
		for(char e: s1arr) {
		h1.add(e);
		}
		System.out.println(h1);
		for(char element : s2arr) {
		if(h1.contains(element)) {
		count++;
		}
		}
		if(count>0)System.out.println("yes");
		else System.out.println("no");
		
		
	}

}
