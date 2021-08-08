package firstDay;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int sum = 0;
		int sub = 0;
		int mul = 1;
		int percentage = 0;

		Scanner getInput = new Scanner(System.in);
		System.out.println("How many values you need a sum for ? ");
		int values = getInput.nextInt();

		int[] eachValue = new int[values];

		System.out.println("Enter the function for example + -");
		String func = getInput.next();
		char Func = func.charAt(0);

		if (Func == '+') {
			for (int i = 0; i < eachValue.length; i++) {
				System.out.println("Enter the " + (i + 1) + " number");
				eachValue[i] = getInput.nextInt();
				sum = sum + eachValue[i];
			}
			System.out.println("The sum is : " + sum);

		} else if (Func == '-') {
			for (int i = 0; i < eachValue.length; i++) {
				System.out.println("Enter the " + (i + 1) + " number");
				eachValue[i] = getInput.nextInt();
				if (i == 0) {
					sub = eachValue[i] - sub;
				} else {
					sub = sub - eachValue[i];
				}
			}
			System.out.println("The difference is : " + sub);
		} else if (Func == '*') {
			for (int i = 0; i < eachValue.length; i++) {
				System.out.println("Enter the " + (i + 1) + " number");
				eachValue[i] = getInput.nextInt();
				mul = mul * eachValue[i];
			}
			System.out.println("The multiplicate is : " + mul);
		} else if (Func == '%') {
			for (int i = 0; i < eachValue.length; i++) {
				System.out.println("Enter the " + (i + 1) + " number");
				eachValue[i] = getInput.nextInt();
				percentage = percentage + eachValue[i];
			}
			System.out.println("The percentage is : " + percentage / eachValue.length + "%");
		}
	}
}
