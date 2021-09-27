package Miscellanous;

import java.util.HashMap;
import java.util.Map;

public class CountCharHashmap {
	
	public static void main(String[] args) {
		String input="abcdabccc";
		char arr[]=input.toCharArray();
		int count =1; 
		HashMap<Character, Integer> obj = new HashMap<Character, Integer>();
		for(char c: arr)
		{	
			if(obj.containsKey(c))
			{
				obj.put(c,obj.get(c)+1);
			}
			
			else
			{
				obj.put(c,count);
			}
		
		}
		for(Map.Entry entry : obj.entrySet() )
		{
			System.out.println(entry.getKey()+"  " +entry.getValue());
		}
	}

}
