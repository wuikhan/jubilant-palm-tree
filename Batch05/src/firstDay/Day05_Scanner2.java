package firstDay;

import java.util.Scanner;

public class Day05_Scanner2 {

	public static void main(String[] args) {
		System.out.println("How old are you ? ");
		Scanner a = new Scanner(System.in);
		
		// creating an object of scanner class
		// when you need to take input from the user you will use Scanner class
		byte userAge =	a.nextByte();
	
		
		if (userAge < 18) {
			System.out.println("You are too young to start work");
		} else {
			if (userAge >= 18 && userAge < 64) {
				System.out.println("You are eligible to work");
				System.out.println("You are below 64 and you can continue to work");
			} else {
				System.out.println("You are over 64 now , Enjoy your retirement");
			}
		}

	}

}


// what variables do i need to modify
// is there line i need to delete