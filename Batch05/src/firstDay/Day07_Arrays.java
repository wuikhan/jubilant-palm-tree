package firstDay;

public class Day07_Arrays {

	public static void main(String[] args) {
		byte[] a;
		a = new byte[5];
		//int [] a = new int[5];
		
		a[0] = 3;
		a[1] = 9;
		a[2] = 33;
		a[3] = 4;
		a[4] = 15;
		
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		String[] countryNames = { "USA", "UK", "Canada"};
		System.out.println(countryNames[0]);
		System.out.println(countryNames[1]);
		System.out.println(countryNames[2]);
		
		String[] b = new String[5];
		b[0]= "Hello";
		//b[1]= 100;
		System.out.println(b[0]);
		
		boolean[] c = { true, false, true };
		System.out.println(c[0]);
		
		

	}

}
