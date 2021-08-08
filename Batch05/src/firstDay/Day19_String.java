package firstDay;

public class Day19_String {

	public static void main(String[] args) {
		String one = new String("WELCOME to Codegator bootcamp");
		String two = "HeLLo WorLd";
		
		String afterReplace = two.replace('L', 'l');
		System.out.println("After replacing cap L : "+afterReplace);
		
		
		System.out.println(one.substring(11));
		System.out.println(one.substring(11, 20));
		
		
		System.out.println(two.indexOf('l'));
		// you need to find all the email addresses who has email with 4 character
		String email = "abcde@gmail.com";
		int emailIndex = email.indexOf('@');
		if(emailIndex==4) {
			System.out.println("The email has 4 character");
		}
		
		System.out.println(two.charAt(6));
		char a = two.charAt(4);
		System.out.println(a);
		
		System.out.println(one.startsWith("WELCOME to"));
		System.out.println(one.startsWith("Welcome to"));
		System.out.println(one.endsWith("bootcamp"));
		System.out.println(one.endsWith("BOOTCAMP"));
		
		// length();
		int len = one.length(); // 29
		System.out.println(len);
		System.out.println(two.length());

		System.out.println("Actual String Text > " + one);
		String convertedLower = one.toLowerCase();
		System.out.println("toLowerCase > " + convertedLower);

		String convertedUpper = one.toUpperCase();
		System.out.println("toUpperCase > " + convertedUpper);

		String firstValue = "HELLO";
		String secondValue = "hello";
		String thirdValue = "hell0";
		String forthValue = "hello";
		String fifthValue = "  hello world  ";
		
		String afterConcatination = firstValue.concat("WORLD");
		System.out.println(afterConcatination);
		System.out.println(firstValue); // Strings are immutable, you cannot change the string
		System.out.println("Without using trim method "+fifthValue);
		System.out.println("After using the trim method " +fifthValue.trim());
		
		
		System.out.println("compareToIgnoreCase "+firstValue.compareToIgnoreCase(secondValue));
		System.out.println("compareToIgnoreCase "+secondValue.compareToIgnoreCase(thirdValue));
		System.out.println("compareToIgnoreCase "+forthValue.compareToIgnoreCase(fifthValue));

		boolean returnTrue = firstValue.equalsIgnoreCase(secondValue);
		System.out.println(returnTrue);

		boolean returnFalse = secondValue.equalsIgnoreCase(thirdValue);
		System.out.println(returnFalse);
		
		boolean returnFalseEqual = firstValue.equals(secondValue);
		System.out.println(returnFalseEqual);
		
		boolean returnTrueEquals = secondValue.equals(forthValue);
		System.out.println(returnTrueEquals);
		
		int returnCompareTo = secondValue.compareTo(forthValue);
		System.out.println(returnCompareTo);
		
		int returnCompareTo1 = firstValue.compareTo(secondValue);
		System.out.println(returnCompareTo1);
		
		int returnCompareTo2 = secondValue.compareTo(thirdValue);
		System.out.println(returnCompareTo2);
		

	}

}
