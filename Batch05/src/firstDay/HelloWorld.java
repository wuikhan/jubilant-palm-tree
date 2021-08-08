package firstDay;

public class HelloWorld {

	// this method will print Hello World
	public static void main(String[] args) {
		System.out.println("Hello World");
		/*
		 * This is a main method
		 * This was my first program.
		 * System.out.print("Hello World");
		 */
		// store 50 in "a" variable

		// -127 127
		byte a = 127; 
		System.out.println(a);
		
		// -32,768 - 32767
		short b = 32000;
		System.out.println(b);
		
		// Store 30000 in a variable name hello 
		// and print it in the console
		short hello = 30000;
		System.out.println(hello);
		
		// -2^31 - 2^31-1
		int c = 2147483647;
		System.out.println(c);
		
		long d = 600851475143L;
		System.out.println(d);
		
		float e = 10.123456789f;
		System.out.println(e);
		
		double f = 10.123456789987654f;
		System.out.println(f);
		
		char g = 'a';
		System.out.println(g);
		
		boolean h = false;
		System.out.println(h);
		
		String i = "Today is the second day of Java.";
		System.out.println(i);
	}
}
