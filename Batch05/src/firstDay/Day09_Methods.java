package firstDay;

public class Day09_Methods {

	public static void main(String[] args) {
		sample(); 
		
		sampleParameter(33,44);
		sampleParameter(2, 5);
		sampleIntString(200,"hello");
	}
	
	// user defined method without parameters/arguments
	public static void sample() {
		/*
		 * this is a user defined method which does not accept any parameters, this method will print
		 * the sum of 12 and 13
		 */
		System.out.println("This is adding the static values "+(12+13));
	}
	
	
	// user defined method with parameters
	public static void sampleParameter(int a, int b) {
		/*
		 * This method is a user defined method which accepts two arguments int a and int b, this method will print the sum
		 * of values which will be provided as an argument.
		 */
		System.out.println("The sum of two values are : "+(a+b));
	}
	
	public static void sampleIntString(int a, String b) {
		System.out.println("The value of String : "+b+ " is : "+a);
	}
}
