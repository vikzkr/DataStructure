package BinaryHeap;

public class BinaryHeapMain {
	
	public static void main(String[] args) {
		
		BinaryHeapImpl impl= new BinaryHeapImpl(5);
		impl.insert(10, "Max");
		impl.insert(5, "Max");
		impl.insert(15, "Max");
		impl.insert(100, "Max");
		impl.levelOrder();
	}

}
