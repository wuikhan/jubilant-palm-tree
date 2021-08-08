package packageOne;

import packageTwo.Sample_Three;

public class Sample {
	// data members
	public static String name = "Waqas";
	private static int age = 25;
	protected static String last_name = "Khan";
	static int phoneNumber = 77777; // default

	public static void main(String[] args) {
		Sample a = new Sample();
		a.methodOne();
		System.out.println(a.name);
		a.methodTwo();
		System.out.println(a.age);
		a.methodThree();
		System.out.println(a.last_name);
		a.methodFour();
		System.out.println(a.phoneNumber);
		
		System.out.println("***** Scenario 2 *****");
		Sample_Two s2 = new Sample_Two();
		System.out.println(s2.a);
		s2.methodFive();
		// System.out.println(s2.b); this will throw an error because b variable is private
		// s2.methodSix(); this will throw an error because methodSix is a private method
		System.out.println(s2.c);
		s2.methodSeven();
		System.out.println(s2.d);
		s2.methodEight();
		
	
		Sample_Three s3 = new Sample_Three();
		System.out.println(s3.z);
		s3.methodThirteen();
		
		/*
		 * below methods and data members are not visible because they are present
		 * in a different package, only public data members and methods can be accessed
		 */
		//System.out.println(s3.y);
		//s3.methodForteen();
		
		//System.out.println(s3.x);
		//s3.methodFifteen();
		
		//System.out.println(s3.w);
		//s3.methodSixteen();
	
	}
	
	public static void methodOne() {
		System.out.println("This is a public modifier example within the class, This should be accessible.");
	}
	
	private static void methodTwo() {
		System.out.println("This is a private modifier example within the class, This should be accessible.");
	}
	
	protected static void methodThree() {
		System.out.println("This is a protected modifier example within the class, This should be accessible.");
	}
	
	static void methodFour() {
		System.out.println("This is a default modifier example within the class, This should be accessible.");
	}
}
