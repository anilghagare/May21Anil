package demoPackage;

public class Newstar {
	public static void main(String[] args) {
		for(int a=1;a<=5;a++)
		{for(int b=5;b>a;b--)
		{System.out.print(" ");}
		for(int c=1;c<=a;c++)
		{System.out.print("* ");}
		System.out.println();}
		
		for(int a=5;a>=1;a--)
		{for(int b=5;b>a;b--)
		{System.out.print(" ");}
		for(int c=1;c<=a;c++)
		{System.out.print("*");}
		System.out.println();}
		
		
		
		for(int x=1;x<=7;x++)
		{for(int y=7;y>x;y--)
		{System.out.print(" ");}
		for(int z=1;z<=2*x-1;z++)
		{System.out.print("*");}
		System.out.println();}
		
		for(int x=6;x>=1;x--)
		{for(int y=7;y>x;y--)
		{System.out.print(" ");}
		for(int z=1;z<=2*x-1;z++)
		{System.out.print("*");}
		System.out.println();}
		
		
	}

}
