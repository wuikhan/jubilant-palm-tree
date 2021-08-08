package firstDay;


class Calculator {
	void sum() {
		System.out.println("The sum is 2");
	}

	void multiply(int a) {
		System.out.println("This is a multiply method from the parent class"+a);
	}
}

class Calculator2 extends Calculator {
	void sum() {
		System.out.println("The sum is 4");
	}
	
	void multiply(int a, int b) {
		System.out.println("This is a multiply method from the child class"+(a+b));
	}
}

public class Day14_MethodOverriding {

	public static void main(String[] args) {
		Calculator2 a = new Calculator2();
		a.sum();
		a.multiply(3);
		a.multiply(3,5);
	}
}
