package demoPackage;

public class Constructor {
	static int a;
	static float f;
	static char c;
	static boolean b;
	static String s;
	
	Constructor()
	{ a=10;
	 f=10.5f;
	 c='r';
	 s="velocity";
	 b=true;}
	
	Constructor(int r)
	{a=104;
	 f=10.75f;
	 c='y';
	 s="velocity family";
	 b=true;
		
	}
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(f);
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
		
		new Constructor();
		System.out.println(a);
		System.out.println(a);
		System.out.println(f);
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
		
		new Constructor(2);
		System.out.println(a);
		System.out.println(a);
		System.out.println(f);
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
		
		
		
		
		
	}
	

}
