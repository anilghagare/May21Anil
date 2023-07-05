package demoPackage2pract;

public class ClassB extends ClassA
{
    public void demo()
	{
		System.out.println("Substraction");
	}
	public static void main(String[] args) {
		
		ClassB b =new ClassB ();
		b.demo();
		ClassA a= new ClassA ();
		a.demo();
		
		
	}

}
