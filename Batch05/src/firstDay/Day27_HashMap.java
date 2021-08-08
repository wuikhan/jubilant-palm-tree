package firstDay;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day27_HashMap {

	public static void main(String[] args) {
		HashMap<Integer,Integer> a = new HashMap<Integer,Integer>();
		a.put(1, 100);
		a.put(2, 200);
		a.put(3, 300);
		a.put(3, 400);
		a.put(4, 500);
		a.put(null, 600);
		System.out.println(a);
		
		Set<Entry<Integer, Integer>> s = a.entrySet();
		
		Iterator<Entry<Integer,Integer>> i = s.iterator();
		
		while(i.hasNext()) {
		Map.Entry<Integer, Integer>	z = i.next();
		System.out.println(z.getKey());
		System.out.println(z.getValue());
		}
		
		

	}

}
