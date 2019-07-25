package com.visa.training.collections;

public class Circle {
private double radius;

public Circle(double r) {
	super();
	this.radius = r;
}
public String getShape() {
	return "Circle";
}
public double getRadius() {
	return radius;
}
public double computeArea() {
	return 3.14*radius*radius;
}


}
