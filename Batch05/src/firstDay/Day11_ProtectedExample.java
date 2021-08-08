package firstDay;

public class Day11_ProtectedExample {
	
	private static String last_name = "Khan";
	protected static void hello() {
		System.out.println("This is a protected method.");
		Day11_ProtectedExample aa = new Day11_ProtectedExample();
		System.out.println(aa.last_name);
	}

}
