package firstDay;

import java.util.Scanner;

public class Day16_task {

	public static void main(String[] args) {
		int sum = 0;
		int sub = 0;
		int prod = 1;

		Scanner getInput = new Scanner(System.in);
		System.out.println("How many values you need to calculate ?");
		int values = getInput.nextInt(); // 3
		// 2 , 5 , 13
		int[] eachValue = new int[values];

		System.out.println("Enter the function you want to perform for example +, -, %, *");
		String funct = getInput.next(); // +
		char func = funct.charAt(0);

		if (func == '+') {
			for (int i = 0; i < eachValue.length; i++) {
				System.out.println("Enter the " + (i + 1) + " number : ");
				eachValue[i] = getInput.nextInt(); // 5
				sum = sum + eachValue[i];
			}
			System.out.println("The sum is " + sum);
		} else if (func == '-') {
			for (int i = 0; i < eachValue.length; i++) {
				System.out.println("Enter the " + (i + 1) + " number : ");
				eachValue[i] = getInput.nextInt(); // 5
				if (i == 0) {
					sub = eachValue[i] - sub;
				} else {
					sub = sub - eachValue[i];
				}
			}
			System.out.println("The difference is " + sub);
		} else if (func == '*') {
			for (int i = 0; i < eachValue.length; i++) {
				System.out.println("Enter the " + (i + 1) + " number : ");
				eachValue[i] = getInput.nextInt(); // 2
				prod = prod * eachValue[i]; // 2
			}
			System.out.println("The product is " + prod);
		} else if (func == '%') {
			for (int i = 0; i < eachValue.length; i++) {
				System.out.println("Enter the " + (i + 1) + " number : ");
				eachValue[i] = getInput.nextInt(); // 5
				sum = sum + eachValue[i]; // 2 + 2 = 4 / 2
			}
			System.out.println("The percentage is " + sum/eachValue.length +" %");
		}
	}
}
