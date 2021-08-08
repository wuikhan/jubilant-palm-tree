package firstDay;

 abstract class Laptop {
	 int processor = 500;
	 int a;

	
	abstract void dell(); // abstract method
	
	void speed() { // concrete method
		System.out.println("This laptop has a 16gb ram");
	}
}
 


 class xps extends Laptop {
	public void dell() {
		System.out.println("This is dell method called from xps class");
	}

}

public class Day16_Abstraction {

	public static void main(String[] args) {
	Laptop a = new xps();
	a.dell();
	a.speed();
	System.out.println(a.processor);
	}
}
