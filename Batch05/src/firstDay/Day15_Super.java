package firstDay;

class Furniture {
	String color = "Black";
	
	Furniture(){
		System.out.println("This is a parent class constructor");
	}
	
	Furniture(int a){
		System.out.println("Constructor with a parameter");
	}


	void color() {
		System.out.println("This color is Black from the furniture class");
	}
}

class chair extends Furniture {
	String color = "Brown";
	
	chair(){
		super(5); // redundant
		System.out.println("This is a child class constructor");
	}

	void color() {
		System.out.println("This color is Brown from the chair class");
	}
	
	void newColor() {
		
	}


	void chairColor() {
	
		System.out.println("This will print the chair color from the child class : " + color);
		System.out.println("This will print the chair color from the parent class : " + super.color);
	}

	String tableColor() {
		return "The color of table is " + super.color;
	}
}

public class Day15_Super {

	public static void main(String[] args) {
		chair a = new chair();
		
		// String table = a.tableColor();
		// System.out.println(table);
		// a.color();
	}
}
