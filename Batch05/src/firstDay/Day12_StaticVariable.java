package firstDay;

public class Day12_StaticVariable {
	static int id = 30;
	int a = 40;
	
	public static void main(String[] args) {
		Day12_StaticVariable a = new Day12_StaticVariable();
		Day12_StaticVariable b = new Day12_StaticVariable();
		
		a.gear();
		b.gear();
		
		System.out.println(a.a);
		
		Day12_StaticVariable.id = 50;
		a.gear();
		b.gear();
	}
	
	public static void gear() {
		System.out.println("The value of id is "+id);
	}
}
