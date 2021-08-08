package firstDay;

import java.io.IOException;

public class Day24_Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validateStudent(4);
		System.out.println("Some more code");
	}
	
	public static void validateStudent(int age) {
		if(age < 5) {
			throw new ArithmeticException("The age should be greater than 5");
		
		} else {
			System.out.println("Welcome to school");
		}
	}

}
