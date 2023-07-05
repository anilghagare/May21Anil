package method123pract;

public class ClassB extends ClassA
{
	int y=120;
	public void demo()
	{
		System.out.println("Method");
	}
	public static void main(String[] args) {
		ClassB b= new ClassB ();
		System.out.println(b.y);
		b.demo();
		System.out.println(b.t);
		ClassA a= new ClassA ();
		System.out.println(a.t);
	}

}
