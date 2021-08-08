package firstDay;

import java.util.HashMap;

public class Day27_HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer,String> a = new HashMap<Integer,String>();
		a.put(1,"USA");
		a.put(2, "China");
		a.put(3, "Italy");
		a.put(3, "Afghanistan");
		a.put(4, "Pakistan");
		a.put(null, "Pakistan");
		//a.put(null, "India");
		
		System.out.println(a);
		
		HashMap<Integer,String> b = new HashMap<Integer,String>();
		b.putAll(a);
		System.out.println(b);
		System.out.println(b.size());
		b.remove(null);
		System.out.println(b);
		System.out.println(b.get(3));
	
		System.out.println(a);
		a.remove(null,"Pakistan");
		System.out.println(a);
		
		System.out.println(a.containsKey(5)); // false
		boolean present = a.containsKey(3); // true
		System.out.println(present);
		
		boolean countryPresent = a.containsValue("USA"); // true
		System.out.println(countryPresent);
		
		System.out.println("Values in the B object "+b);
		b.clear();
		System.out.println(b);
		
		
		@SuppressWarnings("unchecked")
		HashMap<Integer,String> aa = (HashMap<Integer,String>) a.clone();
		aa.put(5, "Another Country");
		System.out.println(aa);
		
		boolean emp = aa.isEmpty();
		System.out.println(emp);
		
		System.out.println("A object : "+a);
		a.clear();
		System.out.println(a.size());
		if(!aa.isEmpty() && aa.equals(0) ) {
			boolean country = a.containsValue("USA"); // true
			System.out.println("A object is not empty > "+country);
		} else {
			System.out.println("A obj is empty");
		}
		
	}

}
