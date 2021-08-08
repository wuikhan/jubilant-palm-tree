package firstDay;

public class Day21_Task {

	public static void main(String[] args) {
		
		System.out.println(taskOne("Hello Today is Tuesday"));
		System.out.println(taskTwo("IUFHWEFhiweufhuw823746&^*&*%#$"));
		System.out.println(taskTwo("Uh7&"));
		
		 String a="Today is a good day. It is Thursday. We have a Java Class.";
		 String[] b = a.split("\\.");
		 System.out.println(b.length);
	}
	
	public static String taskOne(String sentence) {
		String a = sentence;
		String b = a.replaceAll(" ", "");
		
		return b;
	}
	
	public static int taskTwo(String values) {
		String a = values;
		String b = a.replaceAll("[^A-Za-z0-9]", "");
		int c = b.length();
		return c;
	}

}
