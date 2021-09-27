package Miscellanous;

import java.util.HashMap;
import java.util.HashSet;


class HackperProblem1 {
	
	public static void main(String[] args) {
		int l = 10, r = 15, q = 2, count=0;
		for (int i = l; i <= r; i++) {
			boolean b = checkforUnequal(i,q);
			if(!b)
			{
				count++;
			}


			
		}
		System.out.println(count);
		
		
	
		
		
	}

	private static boolean checkforUnequal(int i, int q) {
		
		int num =q;
		int result = 2*i;
		String product = String.valueOf(result);
		String comp = String.valueOf(i);
		HashSet set = new HashSet();
		for (char c : product.toCharArray()) {
			set.add(c);	
		}
		System.out.println(set);
		for(char c :comp.toCharArray())
		{
			if(set.contains(c))
				return true;
			
		}
		return false;
		
	}

}
