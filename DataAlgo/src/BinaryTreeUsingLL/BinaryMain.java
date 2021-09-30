package BinaryTreeUsingLL;

public class BinaryMain {
	public static void main(String[] args) {
		
		BinaryTreeUsingLinkedList bt = new BinaryTreeUsingLinkedList();
		bt.insertNewNode("N1");
		bt.insertNewNode("N2");
		bt.insertNewNode("N3");
		bt.insertNewNode("N4");
		bt.insertNewNode("N5");
		bt.insertNewNode("N6");
		bt.insertNewNode("N7");
		bt.insertNewNode("N8");
		bt.insertNewNode("N9");
		bt.insertNewNode("N10");
		bt.insertNewNode("N11");
		bt.insertNewNode("N12");
		bt.insertNewNode("N13");
		bt.insertNewNode("N14");
		bt.insertNewNode("N15");
		bt.levelOrder();
		System.out.println("");
		System.out.println("");
		System.out.println("get deepest Node "+bt.GetDeepestNode().value);
		// bt.deleteDeepestNode();
		System.out.println("");
		bt.deleteNode("N6");
		System.out.println("");
		System.out.println("");
		bt.levelOrder();
		
		
	}

}
