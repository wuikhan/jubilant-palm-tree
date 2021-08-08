package firstDay;

import java.util.Scanner;

/*
 * Create a method that will take 1 parameter as a String. If the String has odd number 
 * of characters and has 3 or more characters, print the character in the middle of the String.
	
	Create a method that will take 1 parameter as a String. If the String has even 
	number of characters and has 5 or more characters, print the middle two characters of the String.
 */
public class Day20_Task {

	public static void main(String[] args) {
		findCenterValue();
	}
	
	public static void findCenterValue() {
		Scanner getInput = new Scanner(System.in);
		System.out.println("Enter few words : ");
		String value = getInput.next();
		int len = value.length();
		System.out.println(len);
		
		int startingValue = 0;
		int endValue = 0;
		
		if(len >= 3) {
			if(len%2 == 1) {
			// odd
				startingValue = len / 2;  // 5
				endValue = 1;
			} else {
				// even
				startingValue = (len / 2) - 1; // 4
				endValue = 2;
			}
			System.out.println("The character in the middle is "+value.substring(startingValue,startingValue+endValue));
		}
	}
}
