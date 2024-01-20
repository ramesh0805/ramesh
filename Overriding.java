package Com.Aishu;
import java.util.*;
class Shape {
	Scanner s = new Scanner(System.in);
	void area() {
		System.out.println("Area of different shapes:");
	}
}
class Circle extends Shape {
	void area() {
		System.out.println("Enter radius:");
		int r = s.nextInt();
		System.out.println("Area of circle:"+(3.14 * r * r));
	}
}
class Square extends Shape {
	void area() {
		System.out.println("Enter side:");
		int S = s.nextInt();
		System.out.println("Area of square is:"+(S*S));
	}
}
class Rectangle extends Shape {
	void area() {
		System.out.println("Enter length and breadth:");
		int l = s.nextInt();
		int b = s.nextInt();
		System.out.println("Area of rectangle is:"+(l*b));
	}
}
public class Overriding {
	public static void main(String[] args) {
		Shape a = new Shape();
		a.area();
		Shape a1 = new Circle();
		a1.area();
		Shape a2 = new Square();
		a2.area();
		Shape a3 = new Rectangle();
		a3.area();
	}

}
