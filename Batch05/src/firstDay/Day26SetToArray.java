package firstDay;

import java.util.ArrayList;
import java.util.HashSet;

public class Day26SetToArray {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		names.add("Waqas");
		names.add("Mo");
		names.add("Ahmed");
		names.add("Ken");
		names.add("Ken");
		names.add("Ken");
		System.out.println("HashSet object values : "+names);
		System.out.println("HashSet object values size : "+names.size());
		
		ArrayList<String> namesAL = new ArrayList<String>(names); 
		namesAL.add("Waqas");
		System.out.println("After adding a new name to Array List : "+namesAL);
		System.out.println("ArrayList size : "+namesAL.size());
		
		
	}

}
