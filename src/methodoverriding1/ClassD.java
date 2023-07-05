package methodoverriding1;

public class ClassD
{
	public static void addition(int x,int y)
	{
		int c=x+y;
		System.out.println(c);
	}
	public static void addition(int x,int y,int z)
	{
		int d =x+y+z;
		System.out.println(d);
	}
	public static void addition(int x ,char s )
	{
		System.out.println(x+'s');
	}
	public static void main(String[] args) {
		addition(23,30);
		addition(20,30,50);
		addition(45, 'e');
	}
	

}
