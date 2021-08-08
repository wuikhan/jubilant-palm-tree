package firstDay;

import java.util.Scanner;

public class Day05_Scanner {

	public static void main(String[] args) {
		// in order to access some methods present in the class we have to create an
		// object of the class.
		// class-name object-name = new class-name();
		// ferrari f2650 = new ferrari();
		// ferrari f4527 = new ferrari();
		
		System.out.println("What is your name ? ");
		Scanner name = new Scanner(System.in);
		String a = name.next(); // John
		System.out.println("Thank you " + a + ", How old are you : ");
		
		// nextInt is a method of scanner class
		int age = name.nextInt();
		System.out.println(a+" is " + age + " years old.");
		System.out.println(a + " are you currently enrolled in school : ");
		boolean isGoing = name.nextBoolean();
	
		System.out.println(a + " is " +age+ "years old , and is currently enrolled : "+isGoing);
		
		
		// John
		// Thank you John, How old are you ?
		// John is 18 years old and currently enrolled in school : false
	}
}

// in different java classes there will be many different methods