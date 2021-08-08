package firstDay;

public class Day09_AdvanceLoop {

	public static void main(String[] args) {
		String[] cars = { "BMW", "Toyota", "Mercedes", "Volvo" };
		for (String car : cars) {
			System.out.println("One dimensional array" + car);
		}

		int[] numbers = { 2, 3, 4, 5, 6 };

		for (int num : numbers) {
			System.out.println(num);
		}

		int[][] numbers2d = { 
				{ 2, 3, 4, 5, 6 }, 
				{ 7, 8, 9, 10, 11 }, 
				{ 12, 13, 14, 15 } };

		for (int[] num2d : numbers2d) {
			for (int a : num2d) {
				System.out.println(a);
			}
		}
		
		// classname objectName = new classname();
		Day08_2DArrays hello = new Day08_2DArrays(); // the class is instantiated
		// hello is the object-instance name
		// created an object of Day08_2DArrays class
		hello.main(args);
		
		
		Day08_2DArrays anotherObject = new Day08_2DArrays();
		anotherObject.main(args);
		
		
		

	}
}
