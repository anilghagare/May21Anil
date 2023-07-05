package method1234;

public class ClassB extends ClassA
{
	int y=100;
	public void demo()
	{
		System.out.println("method ");
	}
	public static void main (String[] args)
	{
		ClassB b1= new ClassB();
		b1.demo();
		System.out.println(b1.x);
		System.out.println(b1.y);
		ClassA a1=new ClassA ();
		a1.demo();
	}

}
