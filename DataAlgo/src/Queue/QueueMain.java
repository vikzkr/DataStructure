package Queue;

public class QueueMain {
	
	public static void main(String[] args) {
		 Queue queue = new Queue(4);
		 queue.enQueue(1);
		 queue.enQueue(2);
		 queue.enQueue(3);
		 queue.enQueue(4);
		int val= queue.deQueue();
		System.out.println(val);
		int val2= queue.deQueue();
		System.out.println(val2);
		
		 
	}

}
