package firstDay;

public class Dog {
	// global variables
	// below are the fields/properties/attributes
	String breed;
	String size;
	String color;
	int age;

	public static void main(String[] args) {
	// create an object of the class
		// className objectName = new className();
		Dog dog1info = new Dog(); // class is instantiated
		
		dog1info.breed = "Neadpolitan Mastiff";
		dog1info.size = "Large";
		dog1info.age = 5;
		dog1info.color = "Black";
		
		System.out.println(dog1info.breed);
		System.out.println(dog1info.size);
		System.out.println(dog1info.age);
		System.out.println(dog1info.color);
		
		Dog dog2info = new Dog();
		dog2info.breed = "Maltese";
		dog2info.size = "Small";
		dog2info.age = 2;
		dog2info.color = "white";
		
		System.out.println(dog2info.breed);
		System.out.println(dog2info.size);
		System.out.println(dog2info.age);
		System.out.println(dog2info.color);
	}

}
