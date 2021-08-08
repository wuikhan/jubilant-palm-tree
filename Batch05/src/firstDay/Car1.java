package firstDay;

public class Car1 {
	
	// Default Constructor
	Car1(){
		System.out.println("This is a default Car Constructor");
	}
	
	// Parameterized Constructor
	Car1(int a){
		System.out.println("This is a parameterized constructor"+a);
	}

	Car1(String a, String b){
		System.out.println("This is a parameterized constructor with String data type "+a);
		System.out.println("This is a parameterized constructor with String data type "+b);
	}
	
	public static void hello() {
		System.out.println("This is a hello method from Car class");
	}

}
