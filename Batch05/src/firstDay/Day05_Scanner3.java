package firstDay;

import java.util.Scanner;

public class Day05_Scanner3 {

	public static void main(String[] args) {
		// Print Statement 1 : Enter the first number :
		// user input 1 : 10
		// Print Statement 2 : Enter the second number :
		// user input 2 : 20
		// Print Statement 3 : Select the arithemetic operation / * + -
		// user input 3 : +

		// The value 1 and value 2 result is xxxx
		
		// using the scanner class accept input from user and perform arithemtic operation
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the first number ");
		int firstValue = a.nextInt();
		System.out.println("Enter the second number ");
		int secondValue = a.nextInt();
		System.out.println("Enter the arithemetic operator for example +, -, *, /");
		char op = a.next().charAt(0);
		String month = a.next();
		switch(op) {
		case '+':
			System.out.println("The sum is : "+(firstValue+secondValue));
			break;
		case '-':
			System.out.println("The difference is : "+(firstValue-secondValue));
			break;
		case '*':
			System.out.println("The multiplication is : "+(firstValue*secondValue));
			break;
		case '/':
			System.out.println("The division is : "+(firstValue/secondValue));
			break;
		}
		
		if(month.equals("January")) {
			System.out.println("Hello");
		}
		/*
		if (op == '+') {
			System.out.println(firstValue + secondValue);
		} else {
			System.out.println("wrong value");
		}
		*/

	}

}
