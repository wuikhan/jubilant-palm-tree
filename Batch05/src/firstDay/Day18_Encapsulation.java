package firstDay;

import java.util.Scanner;

class employee {
	private String name;
	private String lastName;
	public String dob;
	private int age;

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class Day18_Encapsulation {

	public static void main(String[] args) {
		employee a = new employee();
		String name = a.getName();
		System.out.println(name);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first name");
		String fName = scan.next();
		
		a.setName(fName);
		String name2 = a.getName();
		System.out.println(name2);
		
		System.out.println("Enter the last name");
		String lName = scan.next();
		a.setLastName(lName);
		System.out.println(a.getLastName());
		
	
	}
}
