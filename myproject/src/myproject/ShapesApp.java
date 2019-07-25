package myproject;

class Circle{
	private int radius;
	
	 Circle(int rad) {
		radius=rad;
	}
	public boolean getShape(Object O) {
	Circle c= (Circle)O;
	if(c.radius!=0)
	return true;
	else return false;
	}
	
	public double computeArea() {
		return 3.14*radius*radius;
	}
}
class Rectangle{
	private int length;
	private int breadth;
	Rectangle(int l,int b) {
      length=l;
      breadth=b;
	}
	
	public boolean getShape(Object O) {
	Rectangle c= (Rectangle)O;
	if(c.length > c.breadth)
	return true;
	else return false;
	}
	
	public double computeArea() {
		return length*breadth;
	}
}
public class ShapesApp {
public static void main(String[] args) {
	Circle c1= new Circle(5);
	Rectangle c2 =new Rectangle(10,5);
	c1.computeArea();
	
	
}
}
