package com.LinkedList.singleLinkedlist;

public class Main {
	
	public static void main(String[] args) {
		
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		singleLinkedList.insertInLinkedList(10, 0);
		singleLinkedList.insertInLinkedList(15, 1);
		singleLinkedList.insertInLinkedList(20, 2);
		singleLinkedList.insertInLinkedList(25, 3);
		singleLinkedList.traverseLinkedList();
		singleLinkedList.searchNode(20);
		singleLinkedList.deletionOfNode(3);
		singleLinkedList.traverseLinkedList();
	}

}
