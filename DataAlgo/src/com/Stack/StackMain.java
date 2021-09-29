package com.Stack;

public class StackMain {
	
	
	public static void main(String[] args) {
		
		Stack stack = new Stack(4);
//		Boolean isempty = stack.isEmpty();
//		Boolean isFull= stack.isFull();
//		System.out.println("Stack is Empty "+isempty);
//		System.out.println("Stack is Full "+isFull);
		
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		int pop = stack.peek();
		
		
	}
	

}
