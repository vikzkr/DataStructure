package ProblemOnStack;


//Question 
//how to design a stack which in addition to push and pop has a min function that return minimum value , will all operation
//time complexity as O(1)
public class StackMain {
	
	public static void main(String[] args) {
		
		StackQuestion sq= new StackQuestion();
		sq.push(5);
		sq.push(3);
		sq.push(1);
		System.out.println(sq.min());
		
	}

}
