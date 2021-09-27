package DoubleLinkedList;

public class Main {
	
	public static void main(String[] args) {
		
		DoubleLinkedList dll= new DoubleLinkedList();
		dll.insertIntoDoubleLinkedList(5, 0);
		dll.insertIntoDoubleLinkedList(15, 1);
		dll.insertIntoDoubleLinkedList(20, 2);
		dll.insertIntoDoubleLinkedList(30, 3);
		dll.traverDoubleLinkedList();
		dll.reverseTraverseDouble();
		dll.searchNode(30);
		dll.deleteNodeFromDoubleLinkedList(3);
		dll.traverDoubleLinkedList();
	}

}
