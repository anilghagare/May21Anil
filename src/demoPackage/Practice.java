package demoPackage;

public class Practice {
	static int a=10;
	int b=20;
	public static void staticMethod()
	{System.out.println("stat");}
	public void nonstaticMethod()
	{System.out.println("non stat");}
	
	
	public static void main(String[] args) {
		System.out.println(a);
		staticMethod();
		
		
		Practice p=new Practice();
		System.out.println(p.b);
		p.nonstaticMethod();
		
	}
}
