package Miscellanous;

import java.util.Arrays;
import java.util.List;

public class TechM {
	
	public static void main(String[] args) {
		List<Integer> age = Arrays.asList(4,21,22,23,21);
		filterAge(age);
		
		int num = age.stream().reduce(0, Integer::sum);
		System.out.println("num"+num);
	}

	
	
	private static void filterAge(List<Integer> age) {
		age.stream().distinct().filter(i-> i==21|| i==22 || i==23).forEach(System.out::println);
		
	}

}
