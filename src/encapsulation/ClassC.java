package encapsulation;

public class ClassC {
	static int a=90;
	static int b=89;
	static char d='j';
	public static char addition()
	{
		int c=a+b;
		return d;
	}
	public static void main(String [] args)
	{
		char m=addition ();
		System.out.println(m);
	}

}
