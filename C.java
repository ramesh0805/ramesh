package MyPack;
import Pack.A;
import Pack1.B;
class C {
	public static void main(String[] args) {
		A p = new A();
		B a = new B();
		p.msg();
		p.Sq(5);
		p.rectangle(2,3);
		
		System.out.println("...........");
		
		a.Sq(5);
		a.rectangle(2,4);
		
		System.out.println("THE END");
	}
	

}
