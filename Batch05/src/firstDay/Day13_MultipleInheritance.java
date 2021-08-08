package firstDay;

class A {
	A(){
		System.out.println("This is a A constructor");
	}
	private int a = 10;
	void msg() {
		System.out.println("This is from class A");
	}
	
	void helloMethodA() {
		System.out.println("This is from class A");
	}
}
class B extends A {
	B(){
		System.out.println("This is a B constructor");
	}
	
	private int b = 10;
	void hello() {
		System.out.println("This is from class B hello method");
	}
	
	void msg() {
		System.out.println("This is from class B msg method");
	}
}

public class Day13_MultipleInheritance extends B {

	public static void main(String[] args) {
		Day13_MultipleInheritance c = new Day13_MultipleInheritance();
		c.hello();
		c.msg();
		c.helloMethodA();
	}
}
