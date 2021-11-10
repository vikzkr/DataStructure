package Miscellanous;
public class Test {

	int val=10;
	public void foo(Object o) {
		System.out.println("Object");
	}

	public void foo(String s) {
		System.out.println("String");
	}
	
	public void foo(Integer s) {
		System.out.println("Integer");
	}
	public static void main(String[] args) {
		//new Test().foo(null);
		
		Test obj= new Test();
		//obj.foo(null);
		System.out.println(obj.val);
	}

}