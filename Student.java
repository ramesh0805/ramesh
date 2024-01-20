package Com.Aishu;
	import java.util.*;
	public class Student {
		int id;
		String name;
		
		Student()
		{
			System.out.println("This is a default constructor");
		}
	    
		Student(int i,String n)
		{
			id = i;
			name = n;
		}

	public static void main(String args[])
	{
	   Student s = new Student();
	   System.out.println("\nDefault constructor values\n");
	   Scanner S = new Scanner(System.in);
	   System.out.println("Enter Student id:");
	   s.id = S.nextInt();
	   System.out.println("Enter student name:");
	   s.name = S.next();
	   System.out.println("Student id:"+s.id);
	   System.out.println("Student name:"+s.name);

	   System.out.println("\nParametrised constructor values:\n");
	   Student sc = new Student(10,"Aishu");
	   System.out.println("Student id:"+sc.id + "\nStudent name:"+sc.name);
	}

}
