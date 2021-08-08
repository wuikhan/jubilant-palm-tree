package firstDay;

public class Day10_Task {

	public static void main(String[] args) {
		
		addition(4, 5);
		multiplication(4, 3);
		subtraction(6, 3);
		division(9, 2);
	}

	public static void addition(int a, int b) {
		System.out.println("The sum is " + (a + b));
	}

	public static void multiplication(int a, int b) {
		System.out.println("The product is " + (a * b));
	}

	public static void subtraction(int a, int b) {
		System.out.println("The difference is " + (a - b));
	}

	public static void division(int a, int b) {
		System.out.println("The remainder is " + (a / b));
	}

}
