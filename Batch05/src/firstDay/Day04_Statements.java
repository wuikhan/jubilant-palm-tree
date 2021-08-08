package firstDay;

public class Day04_Statements {

	public static void main(String[] args) {
		int age = 66;
		if (age < 18) {
			System.out.println("You are too young to start work");
		} else {
			if (age > 18 && age < 64) {
				System.out.println("You are eligible to work");
				System.out.println("You are below 64 and you can continue to work");
			} else {
				System.out.println("You are over 64 now , Enjoy your retirement");
			}
		}
		double a = 2240.8923423;
		double b = 2240.8923423;
		double c = 2240.8923423;

		if (a > b && a > c) {
			System.out.println("A has the largest value");
		} else if (b > a && b > c) {
			System.out.println("B has the largest value");
		} else if (c > a && c > b) {
			System.out.println("C has the largest value");
		} else {
			System.out.println("All the values are same");
		}

		if (a > b) {
			if (a > c) {
				System.out.println("A is the largest value");
			} else {
				System.out.println("C is the largest value");
			}
		} else if (b > c) {
			System.out.println("B is the largest value");
		} else {
			System.out.println("All values are same");
		}
	}
}
/*
 * Write a program to find largest of three double values using if-else..if
 * Program to find largest number among three numbers using nested if
 */
