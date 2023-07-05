package methodoverriding1;

public class ClassB extends ClassA
{
	public void demo()
	{
		System.out.println("Substraction");
	}
	public static void main(String[] args) {
		ClassB b1= new ClassB ();
		b1.demo();
		ClassA a1=new ClassA ();
		a1.demo();
	}

}
