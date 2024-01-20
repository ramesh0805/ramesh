package Com.Aishu;
import java.util.*;
class Ok {
	public int area (int s)
	{
		System.out.println("Area of square is:");
		return(s*s);
	}
	
	public int area (int l,int b) {
		System.out.println("Area of rectangle is:");
		return(l*b);
	}
	
	public double area (double r)
	{
		System.out.println("Area of circle is:");
		return(3.14*r*r);
	}
	
	public int area (int l,int b,int h) {
		System.out.println("Volume of cuboid is:");
		return(l*b*h);
	}
}
public class Overload {

	public static void main(String[] args) {
		int x;
		double z;
		Ok a = new Ok();
		System.out.println("DISPLAYING OVERLOADING");
		x=a.area(5);
		System.out.println(x);
		x=a.area(2,6);
		System.out.println(x);
		z=a.area(4.3);
		System.out.println(z);
		x=a.area(2,5,6);
		System.out.println(x);
	}
}
