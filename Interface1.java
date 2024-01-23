package vamsi;
import java.io.*;
/*public class Interface1 {
    public static void main(String[] args) {
        Person4 p = new Employee1();
        p.read();
        p.display(); 
        p.EAA();
        Person4.CAA();
    }



interface Person4{
	 String college = "GPREC"; //public static final
	 abstract void read();
	 void display();
	 
	 default void EAA() {
     	System.out.println("Sports");
     	System.out.println("Yoga");
     	System.out.println("NSS");
     	System.out.println("VCS");
        Internship();
     }
	 
	 static void CAA() {
     	System.out.println("Bhuvanavijayam");
     }
     
     private void Internship() {
     	System.out.println("Summer Internship");

     }

}

class Employee1 implements Person4{
    String name;
    double salary;
	@Override
	public void read() {
		// TODO Auto-generated method stub
		name = "xyz";
		salary = 10930;
	}

	@Override
	public void display() {
		name = "xyz";
		salary = 10930;
		System.out.println("Employee name: " +name);
		System.out.println("Employee Salary: " +salary);
		System.out.println("Employee name: " +name);
	}
}*/










public class Interface1 {
    public static void main(String[] args) {
        Person4 p = new Employee1();
        p.read();
        p.display();
        p.EAA(); // Calling default method
        Person4.CAA(); // Calling static method
    }
}

interface Person4 {
    String college = "GPREC"; // public static final

    void read();

    void display();

    default void EAA() {
        System.out.println("Sports");
        System.out.println("Yoga");
        System.out.println("NSS");
        System.out.println("VCS");
        Internship();
    }

    static void CAA() {
        System.out.println("Bhuvanavijayam");
    }

    private void Internship() {
        System.out.println("Summer Internship");
    }
}

class Employee1 implements Person4 {
    String name;
    double salary;

    @Override
    public void read() {
        name = "xyz";
        salary = 10930;
    }

    @Override
    public void display() {
        name = "xyz";
        salary = 10930;
        System.out.println("Employee name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}




