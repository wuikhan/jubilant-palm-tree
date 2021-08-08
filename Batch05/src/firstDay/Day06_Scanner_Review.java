package firstDay;

import java.util.Scanner;

public class Day06_Scanner_Review {

	public static void main(String[] args) {
		// provided a hard coded value
		//int a = 60;
		//System.out.println(a);
		
		// scanner class helps us to get an input from the user
		// if the light is on/off boolean
		// what is the age of a person byte
		// what is the balance on the account int
		// what is the employees name String
		// String into char
		
		// if we need to access different methods from the class we need to create
		// an object / instance of the class
		
		// How to create an object e.g className objName = new className();
		
		Scanner getInput = new Scanner(System.in); // getInput is an object name
		System.out.println("Enter your name, please : ");
		String name = getInput.next(); // name is a variable name
		System.out.println("My name is : "+name);
		System.out.println("Enter your age : ");
		byte age = getInput.nextByte();
		System.out.println("The age is : "+age);
		System.out.println("What is the account balance : ");
		int balance = getInput.nextInt();
		System.out.println("The account balanace is : "+balance);
		
		
		int a = 10; // initialized a value
		int b; // declared a variable
		b = 20; // initialized a value
		
		
	}
}
