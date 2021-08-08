package firstDay;



class Faculty {
	double salary = 50000;
	
	public static void branch() {
		System.out.println("This is a method in Faculty class");
	}
	
}

public class Student extends Faculty {
	double bonus = 30000;

	public static void main(String[] args) {
	Student a = new Student();
	System.out.println(a.salary);
	System.out.println(a.bonus);
	a.branch();

	}

}
