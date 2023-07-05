package encapsulation;

public class ClassA {
	private static int a=20;
	private static int b=30;
	
	private static String username ="Velocity";
	private static String password ="Velocity1234";
	
	public static void addition()
	{
		System.out.println(a);
		System.out.println(b);
		int c =a+b;
		System.out.println(c);
	}
	public static String username()
	{
		System.out.println(username);
		return username;
	}
	public static String password()
	{  System.out.println(password);
		return password;
	}
	public static void main(String[] args) {
		username();
		password();
	}
	
	

}
