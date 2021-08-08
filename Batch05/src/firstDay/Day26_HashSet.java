package firstDay;

import java.util.HashSet;
import java.util.Iterator;

public class Day26_HashSet {

	public static void main(String[] args) {

		HashSet<String> cars = new HashSet<String>();
		cars.add("Toyota");
		cars.add("BMW");
		cars.add("Merc");
		System.out.println(cars);
		System.out.println(cars.size());
		cars.add("Honda");
		System.out.println(cars.size());
		System.out.println(cars);
		cars.add("BMW");
		System.out.println("after adding a duplicate car : " + cars.size());
		System.out.println("after adding a duplicate car : " + cars);
		// if there is a scenario where you wana make sure that it is not displaying duplicate values 
		// and you dont care about the insertion order
		HashSet<String> carsClone = (HashSet<String>) cars.clone();
		carsClone.add("Lexus");
		System.out.println("After usign clone "+carsClone);
		System.out.println(cars);
		
		if(carsClone.contains("Toyota")) {
			System.out.println("Car exsits");
		} else {
			System.out.println("does not exist");
		}
		
		carsClone.clear();
		System.out.println(carsClone);
		System.out.println("Cars Clone object " +carsClone.isEmpty());
		System.out.println(cars);
		System.out.println("Cars object "+cars.isEmpty());
		
		cars.remove("Toyota");
		System.out.println(cars);
		
		Iterator<String> carsSet = cars.iterator();
		
		while(carsSet.hasNext()) {
			System.out.println(carsSet.next());
		}
		
		for(String car : cars) {
			System.out.println(car);
		}
	}

}
