package methodoverriding1;

public class ClassC {
	public static void addition(int a,int b,int c)
	{int d =a+b+c;
		System.out.println(d);
	}
	public static void addition(int a,int b)
	{int c =a+b;
		System.out.println(c);
	}
	public static void addition(int a,char r)
	{int t =a+r;
		System.out.println(t);
	}
	public static void main(String[] args)
	{
		addition(20,30);
		addition(10,20,30);
		addition(20,'r');
	}

}
