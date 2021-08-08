package firstDay;

public class Day21_StringBuffer {

	public static void main(String[] args) {
		
		String a = "Hello";
		String c = a.concat("World");  // Hello World
		
		System.out.println(a.concat("World"));
		System.out.println(a);
		
		StringBuffer b = new StringBuffer("Waqas");
		System.out.println("String Buffer 1 : "+b);
		b.append("Khan");
		System.out.println("String Buffer appended : "+b);
		b.insert(5, " ");
		System.out.println(b);
		b.insert(6, "u");
		System.out.println(b);
		b.insert(7, ".");
		System.out.println(b);
		b.reverse();
		System.out.println(b);
		b.reverse();
		System.out.println(b);
		
		b.delete(6, 8);
		System.out.println(b);
		
		b.deleteCharAt(2);
		System.out.println(b);
		
		b.replace(0, 4, "Waqas");
		System.out.println(b);

	}

}
