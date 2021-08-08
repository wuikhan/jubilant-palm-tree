package firstDay;

public class Day07_DoWhileLoop {

	public static void main(String[] args) {
		//ask a user how many values you need to enter
		//if the user enters 3
		//make him enter 3 values
		//and print the sum of those 3 numbers
		
		for(int i=0;i<15;i++) {
			if(i==5) {
				System.out.println("The value of i is 5");
			break;
			}
			System.out.println("The value of i outside if "+i);
		}
		
		
		int i = 10;
		do {
			System.out.println("The value of i is (using do while loop) : "+i);
			i++;
		} while(i<5);
		
		System.out.println("The loop will exit");

	}

}
