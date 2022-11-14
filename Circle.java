package Inheritance;

class Circle extends Shape {
	double radius;
public Circle(double radius) {
	this.radius=radius;
}
public double Perimeter() {
	double CP = 2*Math.PI*radius;
	return CP;
}
public double area() {
	double CA = Math.PI*Math.pow(radius, 2);
	return CA;
}
}
