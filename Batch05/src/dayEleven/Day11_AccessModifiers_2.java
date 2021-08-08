package dayEleven;

public class Day11_AccessModifiers_2 {
	int a = 10;
	public int b = 50;

	static void hello() {
		System.out.println("Hello, this method is being called from day 11 package");
	}
	
	 static void helloPublic() {
		System.out.println("This is a public method present in a different package");
	}
	
	
	protected static void helloProtected() {
		System.out.println("This is a protected method inside other package");
	}

}
