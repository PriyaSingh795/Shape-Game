package project;

public class Rectangle extends TwoDShape {
	double l;
	double w;
	
	public Rectangle() {
		
	}
	Rectangle(double l,double w){
		this.l = l;
		this.w = w;
	}
	public void getArea() {
		System.out.println("Area of Rectangle is :"+l*w+" sq. unit");
	}
	public void getPerimeter() {
		System.out.println("Perimeter of Rectangle is :"+2*(l+w)+" unit");
	}
}
