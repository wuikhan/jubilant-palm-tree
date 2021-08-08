package firstDay;

public class Day08_2DArrays {

	public static void main(String[] args) {
//		int[][] numbers = new int[2][3];
//		numbers[0][0] = 100;
//		numbers[0][1] = 200;
//		numbers[0][2] = 300;
//		
//		numbers[1][0] = 400;
//		numbers[1][1] = 500;
//		numbers[1][2] = 600;
//		
//		System.out.println(numbers[0][1]);
		
		int[][] num = {
				{ 5, 6, 7, 8}, // num[0]
				{ 4, 5, 7}, // num[1]
				{ 14, 25, 36, 47} // num[2]
		};
		
//		System.out.println(num[0][3]);
//		System.out.println(num[1][2]);
//		System.out.println(num[2][1]);
		//System.out.println(num[1][3]);
		
		for(int row=0; row < num.length; row++) {
			for(int col=0; col < num[row].length; col++ ) {
				System.out.println(num[row][col]);
			}
		}
	}
}
