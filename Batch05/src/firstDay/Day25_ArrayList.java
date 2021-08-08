package firstDay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Day25_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Monday");
		a.add("Tuesday");
		a.add("Wednessday");
		System.out.println(a);
		System.out.println(a.size());
		a.add("Thursday");
		System.out.println(a);
		a.add(0, "Sunday");
		System.out.println(a);
		a.add("Thursday");
		System.out.println(a);
		
		a.remove("Thursday");
		System.out.println(a);
		
		a.remove(0);
		System.out.println(a);
		
		a.set(2, "Sunday");
		System.out.println(a);
		
		int indexOfSunday = a.indexOf("Sunday");
		System.out.println(indexOfSunday);
		
		String val = a.get(3);
		System.out.println("using the get method "+val);
		
		/*
		 * String[] b = { "monday", "tuesday" }; System.out.println(b[0]);
		 */
		if(a.contains("Sunday")) {
			System.out.println("value exits");
		} else {
			System.out.println("value does not exist");
		}
		
		a.clear();
		System.out.println(a);
		
		ArrayList<Integer> intValues = new ArrayList<>();
		intValues.add(5);
		intValues.add(1);
		intValues.add(15);
		intValues.add(12);
		intValues.add(53);
		intValues.add(231);
		
		System.out.println(intValues);
		Collections.sort(intValues);
		System.out.println(intValues);
		
		for(int i=0;i <intValues.size();i++ ) {
			System.out.println(intValues.get(i));
		}
		
		for(Integer aa : intValues) {
			System.out.println(aa);
		}
		
		Iterator<Integer> aa = intValues.iterator();
		while(aa.hasNext()) {
			System.out.println("Using iterator interface"+aa.next());
			aa.remove();
		}
		System.out.println(intValues);
	}

}
