package firstDay;

import java.util.Scanner;

public class Day06_tasks {

	public static void main(String[] args) {
		
	

		for (int i = 20; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println("even numbers : " + i);
			}
		}

		for (int i = 20; i <= 50; i++) {
			if (i % 2 == 1) {
				System.out.println("odd numbers : " + i);
			}
		}

		for (int i = 0; i <= 2; i++) {
			Scanner month = new Scanner(System.in);
			System.out.println("Please enter the month you were born in : ");
			String monthValue = month.next();
			if (monthValue.equals("Jan") || monthValue.equals("Feb") || monthValue.equals("Mar")) {
				System.out.println("Winter");
			} else if (monthValue.equals("Apr") || monthValue.equals("May") || monthValue.equals("Jun")) {
				System.out.println("Spring");
			} else if (monthValue.equals("Jul") || monthValue.equals("Aug") || monthValue.equals("Sep")) {
				System.out.println("Summer");
			} else if (monthValue.equals("Oct") || monthValue.equals("Nov") || monthValue.equals("Dec")) {
				System.out.println("Fall");
			} else {
				System.out.println(
						"Enter a valid month, Make sure the first character is upper case and remaining lower case for example Jan, Feb etc.");
			}
		}
	}

}
