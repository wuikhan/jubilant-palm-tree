package firstDay;

public class Day12_InstanceVariable {
	// Instance / Global variable
	String name = "Waqas";
	int value;

	public static void main(String[] args) {
		
		Day12_InstanceVariable a = new Day12_InstanceVariable();
		System.out.println(a.name);
		a.value = 500;
		System.out.println(a.value);
		
		a.hello();
	}
	
	public static void hello() {
		Day12_InstanceVariable b = new Day12_InstanceVariable();
		b.name = "John";
		System.out.println(b.name);
		b.value = 1000;
		System.out.println(b.value);
	}

}
