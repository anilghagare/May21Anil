package demoPackage;

public class NewForloops
{
	public static void main(String[] args) 
	{//rectangle
		for(int a=1;a<6;a++) 
		{
			for(int b=1;b<6;b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//left side right angle triangle
		for(int i=1;i<6;i++) 
		{for(int j=1;j<=i;j++) 
		{
			System.out.print("*");
		}
		System.out.println();
			
		}
		
		// inverted right angle triangle
		
		for(int i=1;i<=5;i++) 
		{for(int j=5;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
		}
		
		//right side right angle triangle
		
		for(int i=1;i<=5;i++)
		{for(int j=5;j>i;j--) 
		{System.out.print(" ");}
		for(int k=1;k<=i;k++)
			{System.out.print("*");}
			System.out.println();
		}
		for(int i=1;i<=7;i++) {
			for(int j=7;j>i;j--) {
				System.out.print(" ");}
			for(int k=1;k<=i;k++) {System.out.print("*");}
			System.out.println();
		}
		}
	}
