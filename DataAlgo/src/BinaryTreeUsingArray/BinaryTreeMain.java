package BinaryTreeUsingArray;

public class BinaryTreeMain {
	
	public static void main(String[] args) {
		
		
		BinaryTree tree = new BinaryTree(11);
		tree.insertIntoTree("N1");
		tree.insertIntoTree("N2");
		tree.insertIntoTree("N3");
		tree.insertIntoTree("N4");
		tree.insertIntoTree("N5");
		tree.insertIntoTree("N6");
		tree.insertIntoTree("N7");
		tree.insertIntoTree("N8");
		tree.insertIntoTree("N9");
		
		
		tree.preOrder(1);
		System.out.println("");
		tree.levelOrder();
	}

}
