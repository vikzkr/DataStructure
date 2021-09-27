package Miscellanous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ComparatorExample {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		List list = new ArrayList<Integer>();
		list.add(new Employee("Cikas", 25));
		list.add(new Employee("Cikas", 22));
		list.add(new Employee("Auresh", 27));
		list.add(new Employee("zuchNhi", 29));
		 Comparator<Employee> c = (Employee e1, Employee e2)->{ return
		  (Integer.valueOf(e1.getAge()).compareTo (Integer.valueOf(e2.getAge())));
		  };
		
		  Comparator<Employee> c2 = (Employee e1, Employee e2)->{ return
				  (Integer.valueOf(e1.getAge()).compareTo (Integer.valueOf(e2.getAge())));
				  };
				 
		
//		Collections.sort(list,new Comparator<Employee>()
//		{
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				
//				return (o1.getAge() - o2.getAge());
//			}
//		});
		
				  Collections.sort(list,Comparator.comparing(Employee::getName).reversed().thenComparing(Employee::getAge));
					list.forEach(System.out::println);
		
					 int n = 0;
					    Random r = new Random();
					    n=r.nextInt(7);
					    
					    System.out.println(n);
	}

}
