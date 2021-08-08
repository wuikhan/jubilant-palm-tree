package firstDay;

class Students {
	int rollNumber;
	String studentName;
	float fee;
	String LastName;
	
	Students(int rollNumber, String studentName, float fee){
		this.rollNumber = rollNumber; // 100
		this.studentName = studentName; // John
		this.fee = fee; // 3000
	}
	
	Students(String LastName){
		this.LastName = LastName;
	}
	
	void displayStudentsData() {
		System.out.println("Student name is : "+studentName+" and roll number is : "
				+ ""+rollNumber+" and his/her course fee is :"+fee);
	}
	
	void displayStudentLastName() {
		System.out.println("Student last name is "+LastName);
	}
	
	
}

public class Day15_This {

	public static void main(String[] args) {
	Students studentOne = new Students(100, "John", 3000.00f);
	studentOne.displayStudentsData();
	Students studentTwo = new Students(200, "Chris", 4000.00f);
	studentTwo.displayStudentsData();
	
	Students studentThree = new Students("Khan");
	studentThree.displayStudentLastName();
	}
}