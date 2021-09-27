package circularLinkedList;

public class Main {
	
		public static void main(String[] args) {
			
			CircularLinkedList cll = new CircularLinkedList();
			cll.insertIntoCircularLinkedList(5, 0);
			cll.insertIntoCircularLinkedList(10, 1);
			cll.insertIntoCircularLinkedList(15, 2);
			cll.insertIntoCircularLinkedList(20, 3);
			cll.traverseCircularLinkedList();
			cll.searchNode(5);		
			cll.traverseCircularLinkedList();
			cll.deleteNode(3);
			cll.traverseCircularLinkedList();
			
		}

}
