package firstDay;
/*
 * We have to calculate the percentage of marks obtained 
 * in three subjects (each out of 100) by student A and 
 * in four subjects (each out of 100) by student B. 
 * Create an abstract class 'Marks' with an abstract method 
 * 'getPercentage'. It is inherited by two other classes 'A' and 'B' 
 * each having a method with the same name which returns the percentage 
 * of the students. The constructor of student A takes the marks in three subjects 
 * as its parameters and the marks in four subjects as its parameters for student B. 
 * Create an object for each of the two classes and print the percentage of marks for 
 * both the students.
 */

 abstract class Marks {
	 abstract float getPercentage();
}
class StudentA extends Marks {
	int sub1;
	int sub2;
	int sub3;
	
	StudentA(int sub1, int sub2, int sub3){
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}

	
	float getPercentage() {
		int sub = sub1 + sub2 + sub3;
		float per = sub / 3;
		return per;
	}
}

class StudentB extends Marks {
	int sub1;
	int sub2;
	int sub3;
	int sub4;
	StudentB(int sub1, int sub2, int sub3, int sub4){
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
	}
	float getPercentage() {
		int sub = sub1 + sub2 + sub3 + sub4;
		float per = sub / 4; 
		return per;
	}
}

public class Day20_Task2 {

	public static void main(String[] args) {
		StudentA a = new StudentA(80,90,90);
		System.out.println(a.getPercentage()+"%");
		
		StudentB b = new StudentB(70,80,90,90);
		System.out.println(b.getPercentage()+"%");

	}

}
