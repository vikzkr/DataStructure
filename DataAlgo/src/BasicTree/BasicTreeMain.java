package BasicTree;

public class BasicTreeMain {
	
	public static void main(String[] args) {
		
		
		BasicTreeImpl drinks = new BasicTreeImpl("Drinks");
		BasicTreeImpl hot = new BasicTreeImpl("Hot");
		BasicTreeImpl cold = new BasicTreeImpl("Cold");
		drinks.addChilder(hot);
		drinks.addChilder(cold);
		System.out.println(drinks.print(0));
		
	}

}
