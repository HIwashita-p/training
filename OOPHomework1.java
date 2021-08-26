// 1.Write a program that defines a shape class with a constructor that gives value to width and height.
//   The define two sub-classes triangle and rectangle, that calculate the area of the shape area().
//   After that, define two variables: a triangle and a rectangle and then call the area() function in this two varibles.
// (LINK: https://gitlab.com/pascaliaasia/pav-training/-/blob/basic-training/basic-programing/java/oop-exercise.md)

class Shape {
	
	int width;
	int height;
	
	public Shape(int constructWidth, int constructHeight){
		width = constructWidth;
		height = constructHeight;
	}
	
}

class Triangle extends Shape {

	public Triangle(int constructWidth, int constructHeight){
		super(constructWidth, constructHeight);
	}
	
	public double area(){
		
		return (width * height / 2.0);
	}
}

class Rectangle extends Shape{
	
	public Rectangle(int constructWidth, int constructHeight){
		super(constructWidth, constructHeight);
	}
	
	public double area(){
		
		return (width * height);
	}
}

class OOPHomework1 {
	public static void main(String[] args) {
		
		Triangle triObj = new Triangle(7, 11);
		Rectangle rectObj = new Rectangle(99, 3);
		
		System.out.println("Triangle width : " + triObj.width  );
		System.out.println("Triangle height: " + triObj.height );
		System.out.println("Triangle area  : " + triObj.area() );
		
		System.out.println("Rectangle width : " + rectObj.width  );
		System.out.println("Rectangle height: " + rectObj.height );
		System.out.println("Rectangle area  : " + rectObj.area() );
		
	}
}