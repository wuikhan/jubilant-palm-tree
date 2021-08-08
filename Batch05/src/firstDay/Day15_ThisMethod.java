package firstDay;

class School {

	School() {
		System.out.println("This is a default school constructor.");
	}

	School(int a) {
		this();
		System.out.println("This is a parameterized constructor : " + a);
	}

	School(int a, int b) {
		this();
		System.out.println("This is 2 parameter constructor : " + (a + b));
	}
}

public class Day15_ThisMethod {

	public static void main(String[] args) {
		School b = new School(5, 55);
	}

}
