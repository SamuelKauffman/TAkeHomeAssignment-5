package Inheritance;

class Square extends Shape {
	double length;
	double width;

public Square(double length, double width) {
	this.length=length;
	this.width=width;
}
public double perimeter() {
	double SP = 2*(length+width);
	return SP;
}
public double area() {
	double SA= length*width;
	return SA;
}
}
