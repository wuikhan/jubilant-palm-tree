package packageTwo;

class Sample_Four {
	/* data member or methods */
	public static int a = 200;
	private static int b = 300;
	protected static int c = 400;
	static int d = 500;

	public static void methodNine() {
		System.out.println("This is method nine in the sub class");
	}

	private static void methodTen() {
		System.out.println("This is method Ten");
	}
	
	protected static void methodEleven() {
		System.out.println("This is method eleven");
	}
	
	static void methodTweleve() {
		System.out.println("This is method Tweleve");
	}
}

public class Sample_Three {
	
	public static boolean z = true;
	private static boolean y = false;
	protected static int x = 200;
	static int w = 500;
	
	public static void main(String[] args) {
		Sample_Four s3 = new Sample_Four();
		System.out.println(s3.a);
		s3.methodNine();
		/*
		 * below variable and method will not be accessible because they are set to
		 * private and they are present in the sub class
		 */
		// System.out.println(s3.b);
		// s3.methodTen();
		System.out.println(s3.c);
		s3.methodEleven();
		
		System.out.println(s3.d);
		s3.methodTweleve();
	}
	
	public static void methodThirteen() {
		System.out.println("This is method thirteen");
	}
	private static void methodForteen() {
		System.out.println("This is method forteen");
	}
	protected static void methodFifteen() {
		System.out.println("This is method fifteen");
	}
	static void methodSixteen() {
		System.out.println("This is method sixteen");
	}

}
