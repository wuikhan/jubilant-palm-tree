package firstDay;

public class Day02_DefaultValues {
	static int a; // no value assigned
	static double c;
	static char d;
	static boolean e;
	static float f;
	static String g;
	
	public static void main(String[] args) {
		// the default value of int data type is 0
		System.out.println(a);
		int b = 20000;
		System.out.println(b);
		// it will print the default value of double data type
		System.out.println(c);
		// it will print the default value of char data type
		System.out.println(d);
		// it will print the default value of boolean data type
		System.out.println(e);
		// it will print the default value of float data type
		System.out.println(f);
		// it will print the default value of String data type
		System.out.println(g);
		
		String h = "Hello";
		String i = "World";
		System.out.println(h+i);
		System.out.println("This is an example of String concatination"+" "+h+" "+i);
		
		System.out.println(2+2); // 4
		byte j = 2;
		byte k = 5;
		byte l = 10;
		System.out.println(j+k+l); // 7
		System.out.println(j-k); // -3
		System.out.println(j*k); // 10
		System.out.println(j/k); // 0.4
		System.out.println(j%k); // 2
		

		
	}
}
