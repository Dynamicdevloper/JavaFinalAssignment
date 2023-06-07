package in.ineuron.assessment;

import java.util.Scanner;

public class PolymorphismQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		Calculations calculations=new Calculations();
		
		System.out.println("Enter side of the square: ");
		int side=scan.nextInt();
		Shape square= new Square(side);
		calculations.calculate(square);
		
		System.out.println("Enter height, base and hypotenuse of the triangle: ");
		int height=scan.nextInt();
		int base=scan.nextInt();
		int hypotenuse=scan.nextInt();
		Shape triangle= new Triangle(height, base, hypotenuse);
		calculations.calculate(triangle);
		
		System.out.println("Enter length and breadth of rectangle ");
		int length=scan.nextInt();
		int breadth=scan.nextInt();
		Shape rectangle= new Rectangle(length, breadth);
		calculations.calculate(rectangle);
		
		
		System.out.println("Enter radius of the circle: ");
		int radius=scan.nextInt();
		Shape circle= new Circle(radius);
		calculations.calculate(circle);
		
		
		
		
		
	}

}

class Calculations{
	public void calculate(Shape shape) {
		shape.area();
		shape.perimeter();
	}
}


interface Shape{
	public void area();
	public void perimeter();
}

class Square implements Shape{
	
	private int side;
	
	public Square(int side) {
		this.side=side;
	}
	@Override
	public void area() {
		int area=side*side;
		System.out.println("Area of the Square is: "+ area);
		
	}

	@Override
	public void perimeter() {
		int perimeter=4*side;
		System.out.println("Perimeter of Square: "+perimeter);
		
	}
	
}


class Triangle implements Shape{ 
	
	private int height;
	private int base;
	private int hypotenuse;
	
	Triangle(int height, int base, int hypotenuse){
		this.base=base;
		this.height=height;
		this.hypotenuse=hypotenuse;
	}

	@Override
	public void area() {
		double area= 0.5*height*base;
		System.out.println("Area of triangle is: "+area);
		
	}

	@Override
	public void perimeter() {
		
		int perimeter=height+base+hypotenuse;
		System.out.println("Perimeter of triangle: "+perimeter);
	}
}


class Rectangle implements Shape{
	
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}

	@Override
	public void area() {
		int area= length*breadth;
		System.out.println("Area of rectangle is: "+area);
	}

	@Override
	public void perimeter() {
		int perimeter=2*(this.breadth +this.length);
		System.out.println("Perimeter of rectangle: "+perimeter);
	}
}

class Circle implements Shape{
	
	private int radius;
	public Circle(int radius) {
		this.radius=radius;
	}

	@Override
	public void area() {
		double area= 3.14*radius*radius;
		System.out.println("Area of circle is: "+area);
	}

	@Override
	public void perimeter() {
		double perimeter= 2*3.14*radius;
		System.out.println("Perimeter of circle is: "+perimeter);
	}
	
}