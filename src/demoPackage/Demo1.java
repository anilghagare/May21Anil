package demoPackage;

public class Demo1 {
	static int a=90;
	int b=40;
	public static void staticMethod() 
	{System.out.println("static");}
	
	public void nonstaticMethod()
	{System.out.println("non static");}
	
	public static void main(String[] args) {
		System.out.println(Practice.a);
		
		
		Demo1 d=new Demo1 ();
		System.out.println(d.b);
		d.nonstaticMethod();
		
		
		
		
		
		
		
	}

}
