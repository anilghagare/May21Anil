package methodoverloading;

public class ClassA {
	public static void addition(int a,int b)
	{int c=a+b;
	System.out.println(c);
	}
	public static void addition(int a,int b,int d)
	{int s=a+b+d;
		System.out.println(s);}
	public static void addition(int a,char r)
	{System.out.println(r);}
	public static void main(String[] args) {
		addition(12,13);
		addition(10,20,30);
		addition(12,'t');
		
	}

}
