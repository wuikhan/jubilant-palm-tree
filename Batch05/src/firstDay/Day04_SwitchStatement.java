package firstDay;

public class Day04_SwitchStatement {
	// using switch store a char data type M or F in a sex variable if the case is M
	// print Male and if the case is F print Female in default print do no disclose
	public static void main(String[] args) {
		int a = 5;

		switch (a) {
		case 1:
			System.out.println("The value is 1");
			break;
		case 2:
			System.out.println("The value is 2");
			break;
		case 3:
			System.out.println("The value is 3");
			break;
		case 4:
			System.out.println("The value is 4");
			break;
		case 5:
			System.out.println("The value is 5");
			break;
		case 6:
			System.out.println("The value is 6");
			break;
		case 7:
			System.out.println("The value is 7");
			break;
		case 8:
			System.out.println("The value is 8");
			break;
		case 9:
			System.out.println("The value is 9");
			break;
		default:
			System.out.println("The value is something else");
		}

		char sex = 'f';

		switch (sex) {
		case 'M':
			System.out.println("Male");
			break;
		case 'm':
			System.out.println("Male");
			break;
		case 'F':
			System.out.println("Female");
			break;
		case 'f':
			System.out.println("Female");
			break;
		default:
			System.out.println("Do not disclose");
		}

		int wallet = 107;
		switch (wallet) {
		case 100:
			System.out.println("I have $100 in the wallet");
			break;
		case 200:
			System.out.println("I have $200 in the wallet");
			break;
		case 300:
			System.out.println("I have $300 in the wallet");
			break;
		case 400:
			System.out.println("I have $400 in the wallet");
			break;
		case 500:
			System.out.println("I have $500 in the wallet");
			break;
		default:
			System.out.println("I dont know how much I have in the wallet.");
		}
		
	}

}
