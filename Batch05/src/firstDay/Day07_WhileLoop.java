package firstDay;

public class Day07_WhileLoop {

	public static void main(String[] args) {
		// the variable i is initialized outside the while loop, which is the reason we
		// can access the i variable
		// outside the while loop.
		int i = 2;
		while (i < 5) {
			System.out.println("The value of i is " + i);
			i++;
		}

		System.out.println("The value of i is " + i); // this will print 5

		System.out.println("outside the while loop");

		// in for loop the scope of the j variable is limited to for loop which is the
		// reason we cannot access the variable
		// outside the for loop
		for (int j = 4; j < 10; j++) {
			System.out.println("This is using for loop " + j);
		}

	}

}
