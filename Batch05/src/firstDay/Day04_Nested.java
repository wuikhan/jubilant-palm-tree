package firstDay;

public class Day04_Nested {

	public static void main(String[] args) {
		int pin = 100;
		int balance = 2000;

		if (pin == 100) {
			System.out.println("Valid pin, you can do other transactions");
			if (balance > 400 && balance < 1000) {
				System.out.println("You can withdraw upto $1000");
			} else if (balance > 1000 && balance < 5000) {
				System.out.println("There is a credit card offer for you.");
			} else {
				System.out.println("Balance is too low");
			}
		} else {
			System.out.println("In valid pin, please try again.");
		}
	}
}
// if the customer balance is 3000 offer them a credit card
