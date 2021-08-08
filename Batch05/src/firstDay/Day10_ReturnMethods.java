package firstDay;

public class Day10_ReturnMethods {
	// global variable

	public static void main(String[] args) {
		int value = sample(); // 40
		System.out.println(value);
		
		if(value == 30) {
			System.out.println("The value is 30");
		}
		
		String a = name();
		System.out.println(a);
		
		int z = helloWorld(3, 313, 333);
		System.out.println("in the main method "+z);
		helloWorld(1,2,3); // 6
		helloWorld(4,5,6); // 15		
		sample(); // 40
		sample(); // 40
		sample(); // 40
	}
	
	public static int helloWorld(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("inside the method "+d);
		return d;
	}
	
	public static int sample() {
		int a = 30;
		int b = 20;
		int c = a + b;
		
		return c; //30
	}
	
	public static String name() {
		return "Waqas";
	}
	
}
