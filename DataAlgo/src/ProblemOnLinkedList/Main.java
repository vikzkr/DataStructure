package ProblemOnLinkedList;

public class Main {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.createLL(2);
		ll.insertNode(3);
		ll.insertNode(4);
		ll.insertNode(3);
		ll.insertNode(6);
		ll.traversalLL();
		ProblemsStatement ps = new ProblemsStatement();
		//ps.deleteDups(ll);
		//ll.traversalLL();
		Node n = ps.nLastLinkedList(ll, 3);
		System.out.println(n.value);
		
	}

}
