package methodoverriding;

public class ClassB extends ClassA
{
	public void method()
	{
		System.out.println("Substraction");
	}
	
	public static void main(String[] args) {
		ClassB b1= new ClassB();
		b1.method();
		ClassA a1=new ClassA();
		a1.method();
		
	}

}
