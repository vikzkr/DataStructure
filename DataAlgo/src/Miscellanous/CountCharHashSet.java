package Miscellanous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountCharHashSet {
	
	public static void main(String[] args) {
		String input = "vikasss";
		//char[] arr = input.toCharArray();
		List<Character> list = new ArrayList<>();

//		for(char s:arr)
//		{
//			list.add(s);
//		}
		//System.out.println(input.chars().mapToObj(s->(char)s).collect(Collectors.toList()));
		
		char[] arr1 = input.toCharArray();
        List list1 = new ArrayList();
        for(char a :arr1)
        {
        list1.add(a);
        }
        System.out.println(  ": " + Collections.frequency(list1, 's'));
        System.out.println(list1);
        
       // Set<String> distinct = new HashSet<>(list1);
//        System.out.println(distinct);
//        for (String s: distinct) {
//            System.out.println(s + ": " + Collections.frequency(list1, "A"));
//        }
		//HashSet<char[]> set = new HashSet<>(list);
		int count=1;
//		
//		for(char[] s : list)
//		{
//			
//		}
		
//		for(char c : arr) {
//			if(set.contains(c))
//			{
//				set.add(c);
//				System.out.println(c+" "+ count+1);
//			}
//			else
//			{
//				set.add(c);
//				//System.out.println(c+" "+count);
//			}
//		}
	
		
		
	}
}
