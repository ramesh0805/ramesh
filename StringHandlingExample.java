package Nik;
import java.util.*;
public class StringHandlingExample {
		    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	       
	        String str1 = sc.nextLine();
	        String str2 = sc.nextLine();
	        String c;   

	        c = str1 + str2;
	        System.out.println("Concatenated String: " + c);

	        int length = c.length();
	        System.out.println("Length of the String: " + length);

	        char charAtIndex = c.charAt(7);
	        System.out.println("Character at index 7: " + charAtIndex);

	        String substring = c.substring(0, 5);
	        System.out.println("Substring (0-4): " + substring);

	        int indexOfChar = c.indexOf('W');
	        System.out.println("Index of 'W': " + indexOfChar);
	        
	         String trimmedString = c.trim();
	        System.out.println("Trimmed String: " + trimmedString);

	        String lowercase = c.toLowerCase();
	        String uppercase = c.toUpperCase();
	        System.out.println("Lowercase: " + lowercase);
	        System.out.println("Uppercase: " + uppercase);
	        
	        String replacedString = c.replace('o', 'X');
	        System.out.println("String after replacing 'o' with 'X': " + replacedString);

	        boolean startsWithHello = c.startsWith("Hello");
	        boolean endsWithWorld = c.endsWith("World!");
	        System.out.println("Starts with 'Hello': " + startsWithHello);
	        System.out.println("Ends with 'World!': " + endsWithWorld);

	        String str3 = "hello, World!";
	        boolean isEqualIgnoreCase = c.equalsIgnoreCase(str3);
	        System.out.println("Case-insensitive comparison with 'hello, World!': " + isEqualIgnoreCase);
	    }
}	
