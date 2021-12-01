package Miscellanous;

import java.util.ArrayList;
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
		String s3 = "Vikas";
		char[] s1arr=s1.toCharArray();
		char[] s2arr=s2.toCharArray();
		char[]  we = s3.toCharArray();
		if(we.length>5)
		{
			
		}
		int count = 0;
		HashSet<Character> h1 = new HashSet<Character>();
		List<Character> l1 = new ArrayList<>();
		for(char e: we) {
			l1.add(e);
			}
		
		l1.sort(null);
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
