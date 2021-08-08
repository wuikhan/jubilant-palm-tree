package firstDay;

public class Day08_Arrays {

	public static void main(String[] args) {
//		String[] names = new String[5];
//		
//		names[0] = "John";
//		names[1] = "Mike";
//		names[2] = "Steve";
//		names[3] = "Chris";
//		names[4] = "Peter";
		//names[5] = "Waqas";
		// Array Index out of bound
//		System.out.println("The length of the array is "+names.length);
//		System.out.println("*********** New Code *****************");
		
		/*
		System.out.println("The name is "+names[0]);
		System.out.println("The name is "+names[1]);
		System.out.println("The name is "+names[2]);
		System.out.println("The name is "+names[3]);
		System.out.println("The name is "+names[4]);
		*/
//		for(int i=0; i < names.length;i++) {
//			System.out.println("The name is : "+names[i]);//1
//		}
		// create an array of int values and enter some random numbers
		// datatype[] variableName = { } ;
		int[] numbers = { 5, 6, 7, 8, 9, 8, 7 , 5, 6, 4 };
		int sum = 0;
		
		for(int i=0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(sum);
	}
}
