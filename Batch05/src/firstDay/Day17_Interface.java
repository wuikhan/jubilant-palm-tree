package firstDay;

interface myInterface {
	//int a;
	int a = 10;
 void methodOne();
	void methodTwo();
	
}

interface myInterfaceTwo  {
	void methodThree();
	void methodFour();
}

class implementsInterface implements myInterface,myInterfaceTwo {

	public void methodOne() {
		System.out.println("This is method one");
	}

	public void methodTwo() {
		System.out.println("This is method two");
	}

	public void methodThree() {
		System.out.println("This is method Three");
		
	}

	public void methodFour() {
		System.out.println("This is method Four");
		
	}
}

public class Day17_Interface {

	public static void main(String[] args) {
		myInterface a = new implementsInterface();
		a.methodOne();
		a.methodTwo();
		myInterfaceTwo b = new implementsInterface();
		b.methodThree();
		b.methodFour();
		
	}

}
