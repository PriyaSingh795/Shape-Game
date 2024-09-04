package project;


public class Square extends TwoDShape {
	double side;
	
	public Square() {
		// TODO Auto-generated constructor stub
	}
	
	Square(double side){
		this.side = side;
	}
	public void getArea() {
		System.out.println("Area of Square :"+side*side+"Sq. unit");
	}
	public void getPerimeter() {
		System.out.println("Perimeter of Square is :"+4*side);
	}
}
