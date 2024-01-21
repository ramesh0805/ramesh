package oopj;
import java.util.*;
public class Complex {
public static void main(String[] args) {
	        Trans t = new Trans();
	        t.display();
	        t.Transpose();
	    }
	}

	class Trans {
	    int m;
	    int n;
	    Scanner sc = new Scanner(System.in);
	    int a[][];

	    Trans() {
	        System.out.println("Enter the number of rows and columns:");
	        m = sc.nextInt();
	        n = sc.nextInt();
	        a = new int[m][n];
	        System.out.println("Enter elements:");
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                a[i][j] = sc.nextInt();
	            }
	        }
	        System.out.println("Elements Scanned");
	    }

	    void display() {
	        System.out.println("Displayed Matrix");
	        for (int i = 0; i < m; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(a[i][j] + " ");
	            }
	            System.out.println();  // Move to the next line after each row
	        }
	    }

	    void Transpose() {
	        System.out.println("Transposed matrix");
	        for (int j = 0; j < n; j++) {
	            for (int i = 0; i < m; i++) {
	                System.out.print(a[i][j] + " ");
	            }
	            System.out.println();  // Move to the next line after each column
	        }
	    }
	} 
