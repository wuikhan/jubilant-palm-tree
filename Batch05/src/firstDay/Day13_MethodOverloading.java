package firstDay;

public class Day13_MethodOverloading {

	public static void main(String[] args) {
		//Day13_MethodOverloading obj = new Day13_MethodOverloading();
		//obj.sum(3, 10);
		//obj.sum(5, 6, 7);
		
		sum(4,4);
		sum(8,5,4);
		sum(11.50f, 12.55f);

	}
	
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void sum(float a, float b) {
		System.out.println(a+b);
	}
	
	public static void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}

}
