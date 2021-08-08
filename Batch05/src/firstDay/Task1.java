package firstDay;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * 	Write a Java program to print an int, double and char.
			Write a program to add an integer variable having value 5 and a double variable having value 6.2.
			Write a program to find the square of the number 3.9.
			Write a program to print the area of a rectangle of sides 2 and 3.

			Area = Length x Width
		 */
		
		int a = 5000;
		double b = 50.873284628347682374f;
		char c = 'a';
		System.out.println("The value of a variable is : "+a);
		System.out.println("The value of b variable is : "+b);
		System.out.println("The value of c variable is : "+c);
		
		int d = 5;
		double e = 6.2;
		
		double f = d+e;
		System.out.println("The sum of 5 and 6.2 is " + f);
		
		float g = 3.9f;
		System.out.println("The square of 3.9 is "+g*g);
		
		byte length = 2;
		byte width = 3;
		int area = length * width;
		System.out.println("The area is "+area);
		System.out.println("The area is "+length * width);
		
		
		
		

	}

}
