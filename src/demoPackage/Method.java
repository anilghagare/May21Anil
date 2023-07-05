package demoPackage;

public class Method {
	public static void addition (int x,int y)
	{int c=x+y;
	System.out.println(c);}
	public static void addition(int x,int y,int z)
	{int c=x+y+z;
	System.out.println(c);}
	public static void addition(int x ,char s)
	{
		int c=x+s;
	}
	public static void main(String[] args) {
		addition(12,23);
		addition(10,20,30);
		addition('s',10);
	}
}


