package firstDay;

public class Day06_Loop {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			System.out.println(i+" Hello World "+i); // 10
		}
		
		System.out.println("After the for loop");
		
		for(int i=10; i >= 0; i-- ) {
			System.out.println("The value of i (decreament) is : "+i);
		}
		
		System.out.println("End");
		
		for(int i=0;i<10; i++) {
			if(i%2 == 0) {
				System.out.println("above 5 : "+i);
			} else {
				System.out.println("below 5 : "+i);
			}
		}

	}

}
