package casting;

public class ClassB extends ClassA {
	int a =145;
	static int b=140;
	public void test()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(super.a);
		System.out.println(super.b);
	}
	public static void main(String [] args)
	{
		ClassB b = new ClassB ();
		b.test();
	}

}
