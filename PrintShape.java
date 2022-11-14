package Inheritance;

public class PrintShape {

	public static void main(String[] args) {
		Circle C1 = new Circle(5);
		C1.setColor("Green");
		System.out.println("Circle area: " + C1.area());
		System.out.println("Circle perimeter: " + C1.Perimeter());
		System.out.println("Circle color: " + C1.getColor());
		Square S1 = new Square(5,10);
		S1.setColor("Blue");
		System.out.println("Square area: " + S1.area());
		System.out.println("Square perimeter: " + S1.perimeter());
		System.out.println("Square color: " + S1.getColor());
	}
		
}
