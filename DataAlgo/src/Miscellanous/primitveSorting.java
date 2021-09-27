package Miscellanous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class primitveSorting {
	
	public static void main(String[] args) {
		
		
		List list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(2);
		list.add(7);
		list.add(3);
		list.add(1);
		list.add(10);
		//Collections.sort(list);
	
	list.forEach(i->System.out.println(i));
	}

}
