package firstDay;

final class Day23 {
	void methodOne() {
		System.out.println("This is Day 23");
	}
}

class Day23_Method {
	
	final static void methodTwo() {
		System.out.println("This is Day 23 method two");
	}
}

public class Day23_Final extends  Day23_Method {
	
//	static void methodTwo() {
//		System.out.println("This is Day 23 Final class");
//	}
	static String aa = "Hello";


	public static void main(String[] args) {
		Day23 a = new Day23();
		a.methodOne();
		
		methodTwo();
		System.out.println(aa);
		
		aa = "Hello 2";
		System.out.println(aa);
		
		final StringBuffer bb;
		bb = new StringBuffer("String Buffer example");
		
		System.out.println(bb);
		bb.append("appended");
		System.out.println(bb);
		
		final StringBuffer c = new StringBuffer("some text");
		System.out.println(c.append("more text"));

	}

}
