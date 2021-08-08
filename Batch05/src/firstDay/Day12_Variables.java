package firstDay;

public class Day12_Variables {

	public static void main(String[] args) {
		// local variable
		int a = 10;
		int b = 30;
		System.out.println("This value of a variable is in the main method "+a);
		//System.out.println(c);
		
		Day12_Variables obj = new Day12_Variables();
		obj.hello();
		
		if(true) {
			int z = 100;
			System.out.println(z);
		}
		//System.out.println(z);
	}
	
	public static void hello() {
		int a = 20;
		int c = 40;
		System.out.println("Inside the hello method : "+a);
		System.out.println(c);
	}
}
