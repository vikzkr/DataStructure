package ImplementQueueUsingStack;

import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		QueueStack qs = new QueueStack();
		qs.enQueue(3);
		qs.enQueue(4);
		qs.enQueue(7);
		qs.deQueue();
	}
}
