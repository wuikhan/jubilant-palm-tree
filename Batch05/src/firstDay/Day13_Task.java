package firstDay;


class Car {
	static String color = "red";
	static boolean sedan = true;
	static int year = 2021;
	static String type = "BMW";
	static String model = "535";

	public static void carInformation() {
		System.out.println("The car type is "+type+" model is "+model+" year is "+year+" color is "+color+" it is a sedan "+sedan);
	}
}

public class Day13_Task extends Car {

	public static void main(String[] args) {
		
		System.out.println(color);
		System.out.println(sedan);
		System.out.println(year);
		System.out.println(type);
		System.out.println(model);
		carInformation();

	}
}
