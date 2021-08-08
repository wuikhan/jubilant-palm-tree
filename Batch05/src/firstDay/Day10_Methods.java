package firstDay;

public class Day10_Methods {

	public static void main(String[] args) {
		add();
		subt(5,1,2);
	}
	
	public static void add() {
		/*
		 * using the void keyword we created a method which prints the sum of 
		 * 3 int values without any argument
		 */
		int a = 30;
		int b = 40;
		int c = 60;
		int d = a + b + c;
		System.out.println("The sum of all the values is : "+d);
	}
	
	public static void subt(int a, int b, int c) {
		/*
		 * using the void keyword we created a method which accepts 3 
		 * arguments and prints the difference
		 */
		int d = a - b - c;
		System.out.println("The different of the given values is : "+d);
	}
	
}
