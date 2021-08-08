package firstDay;

import dayEleven.Day11_AccessModifiers_2;

public class Day11_AccessModifiers {
	
	private static String name = "Waqas";

	public static void main(String[] args) {
		Day11_AccessModifiers_2 a = new Day11_AccessModifiers_2();
		// a.hello(); 
		// this line will give compilation error because
		// the method hello() is a default method and it is present
		// in a different package so default methods and data members
		// cannot be accessible
		
		//a.helloPublic();
		System.out.println(a.b);
		
		Day11_ProtectedExample pro = new Day11_ProtectedExample();
		pro.hello();
	
		
		System.out.println(name);
		
		
	}

}
