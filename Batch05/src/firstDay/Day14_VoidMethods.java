package firstDay;

public class Day14_VoidMethods {

	public static void main(String[] args) {
		hello(); // 30
		
		int value = sum();
		System.out.println(value);
		if(value == 40) {
			System.out.println("my code works");
		} else {
			System.out.println("my code does not work");
		}
		
		String browserName = browser();
		if(browserName.equals("Firefox")) {
			System.out.println("Open Firefox");
		} else {
			System.out.println("Open Chrome");
		}
	}
	
	// return type is void
	public static void hello() {
		int a = 10;
		int b = 20;
		int c = a + b;
		
		/* this method is a void method it will not give you any value to store it in any variable*/
	}
	
	public static int sum() {
		int a = 10;
		int b = 20;
		int c = a + b; //30
		
		return c;
	}
	
	public static String browser() {
		String browserName = "Chrome";
		return browserName;
	}
	

}
