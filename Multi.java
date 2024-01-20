package Com.Aishu;
class A
{
	int a=20;
	void display()
	{
		System.out.println("A");
	}
}
class B extends A
{
	int b=30;
			void show()
			{
		System.out.println("B");
			}
}
class C extends A
{
	int c=40;
	void dis()
	{
		System.out.println("C");
	}
}
public class Multi {

	public static void main(String[] args) {
		C obj1 = new C();
		obj1.dis();
		B obj2 = new B();
		obj2.show();
		obj1.display();// TODO Auto-generated method stub
        obj2.display();
	}

}
