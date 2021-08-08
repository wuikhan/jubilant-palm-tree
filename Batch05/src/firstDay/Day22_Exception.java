package firstDay;

import java.util.Scanner;

public class Day22_Exception {

	public static void main(String[] args) {

		
		Scanner a = new Scanner (System.in);
		System.out.println("Enter the first value");
		int first = a.nextInt();
		System.out.println("Enter the second value");
		int second = a.nextInt();
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		String b = null;
	
		
		try {
			int c = first / second; // this can possibly throw arithemetic exception
			System.out.println("Result is "+c);
			System.out.println(arr[4]); // array index out of bound
			System.out.println(b.length()); // null pointer exception
		} catch(ArithmeticException ar) {
			System.out.println(ar);
		} catch(ArrayIndexOutOfBoundsException ar) {
			System.out.println(ar.getMessage());
		} catch (Exception ar) {
			System.out.println(ar.getMessage());
		} finally {
			System.out.println("This is a finally block");
			
		}
		

		System.out.println("this line is after the try/catch block");
	}
}
