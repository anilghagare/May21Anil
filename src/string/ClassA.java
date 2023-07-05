package string;

public class ClassA {
	public static void main(String[] args) {
		String s ="Velocity";
		String b ="Velocityt1234";
		String v ="  Velocity  ";
		
		int i=s.indexOf('c');
		System.out.println(i);
		char c =s.charAt(4);
		System.out.println(c);
		 int d =s.lastIndexOf('t');
		System.out.println(d);
		 
		boolean n =s.startsWith("Vel");
		System.out.println(n);
		n=s.endsWith("city");
		System.out.println(n);
		System.out.println(v.trim());
		System.out.println(s.substring(4));
		System.out.println(s.substring(4,7));
		System.out.println(s.concat("katraj"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
	}

}
