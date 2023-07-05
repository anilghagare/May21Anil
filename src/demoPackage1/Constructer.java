package demoPackage1;

public class Constructer {
	static int a;        // default construter
	static float f;
	static char c;
	static boolean b;
	static String s;

	Constructer()       //zero argument 
	{a=10;
	f=13.5f;
	c='r';
	b=true;
	s="Velocity";}
	
	Constructer(int a)   //with argument
	{a=23;
	f=45.6f;
	c='t';
	b=true;
	s="testing";
	}
	public static void main (String [] args)
	{
		System.out.println(a);
		System.out.println(f);
		System.out.println(c);
		System.out.println(b);
		System.out.println(s);
		
		new Constructer();
		System.out.println(a);
		System.out.println(f);
		System.out.println(c);
		System.out.println(b);
		System.out.println(s);
		
		new Constructer(14);
		System.out.println(a);
		System.out.println(f);
		System.out.println(c);
		System.out.println(b);
		System.out.println(s);
	}

}
