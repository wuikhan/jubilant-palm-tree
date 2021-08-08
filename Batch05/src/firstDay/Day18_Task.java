package firstDay;


abstract class Shape {
	/*
	We have to calculate the area of a rectangle, 
	a square and a circle. Create an abstract class 'Shape' 
	with three abstract methods namely RectangleArea' 
	taking two parameters, 'SquareArea' and 'CircleArea' 
	taking one parameter each and your methods should return 
	you the result value. */
	abstract float rectangleArea(float length, float width);
	abstract float squareArea(float sides);
	abstract float circleArea(float radius);
	
}

class Area extends Shape {
/*
 * The parameters of 'RectangleArea' are 
 * its length and width, that of 'SquareArea' 
 * is its side and that of 'CircleArea' is its radius. 2*3.14*r
 */
	float rectangleArea(float length, float width) {
		return length * width;
	}

	float squareArea(float sides) {
		float sq = sides * 4;
		return sq;
	}

	float circleArea(float radius) {
		return 2 * 3.14f * radius;
	}
	
}

public class Day18_Task {

	public static void main(String[] args) {
		//  Create an object of class 'Area' and call all the three methods.
		Area a = new Area();
		float b = a.rectangleArea(5.5f, 4.0f);
		System.out.println("The rectangle area is : "+b);
		float c = a.squareArea(6.6f);
		System.out.println("The square area is : "+c);
		float d = a.circleArea(3.2f);
		System.out.println("The cirlce area is : "+d);

	}

}
