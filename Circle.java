package project;

public class Circle extends TwoDShape {
double r;
Circle()
{
	
}
Circle (double r){
	this.r = r;
	
}
public void getArea() {
	System.out.println("Area of circle : "+3.14*r*r+" Sq. unit");
}
public void getPerimeter() {
	System.out.println("Perimeter of circle is : "+2*3.14*r);
}
}
