package oopj;
public class MethodOverload {

	public static void main(String[] args) {
		int x;
		double z;
		Ok o = new Ok();
		System.out.println("Method Overloading:");
		x = o.area(5);
		System.out.println(x);
		x = o.area(3,4);
		System.out.println(x);
		z = o.area(6.14);
		System.out.println(z);
		
	}

}

class Ok {
     public int area(int s) {
	    System.out.println("Area of square is");
	    return(s*s);
	    
}
     public int area(int l,int b) {
 	    System.out.println("Area of rectangle is");
 	    return(l*b);
     }
     public double area (double r) {
 	    System.out.println("Area of circle is");
 	    return(3.14 * r * r);
 }
}
