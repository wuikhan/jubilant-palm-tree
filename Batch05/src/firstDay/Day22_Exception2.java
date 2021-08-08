package firstDay;

import java.util.Scanner;

public class Day22_Exception2 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		System.out.println("Enter the first value");
		int first = a.nextInt();
		System.out.println("Enter the second value");
		int second = a.nextInt();
		int c = first / second; // Exception
		System.out.println("Result is " + c);
		System.out.println("this line is after the try/catch block");

	}
}
