
package Com.Aishu;
//import java.io.FileNotFoundException;
//import java.io.FileReader;

public class Exceptionhandling {

	 
	public static void main(String[] args) {
        try {
        	int x=5/0;
        	System.out.println(x);
        }
        catch(ArithmeticException e ) {
        	System.out.println("ERROR:Division by zero");
        }
        
        try {
        	int x = Integer.parseInt("abc");
        	System.out.println(x);
        }
        catch(NumberFormatException e) {
        	System.out.println("Error:Invalid String format for int");
        }
        
        try {
        	String a = null;
        	System.out.println(a.charAt(0));
        }
        catch(NullPointerException e) {
        	System.out.println("Error:Null pointer Exception");
        }
        
        try {
        	String a = "Ramesh is studying";
        	System.out.println(a.charAt(30));
        }
        catch(StringIndexOutOfBoundsException e) {
        	System.out.println("Error:String Index Out Of Bounds");
        }
        
        try {
        	int a[] = new int[5];
        	a[6]=9;
        }
        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("Error:Array Index Out of Bounds");
        }
        try {
        	throw new Exception("Manually raised Exception");
        }
        catch(Exception e) {
        	System.out.println("Error:"+e.getMessage());
        }
	}
}
