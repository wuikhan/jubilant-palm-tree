package firstDay;

public class Day20_Task3 {

	public static void main(String[] args) {
		boolean value = sameValues("Hello","Hello");
		System.out.println(value);
	}
	
	public static boolean sameValues(String actual, String expected) {
		boolean value = actual.equals(expected); // true or false
		return value;
	}
}
