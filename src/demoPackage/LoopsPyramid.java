package demoPackage;

public class LoopsPyramid {
	public static void main(String[] args) {
		for(int a=1;a<=7;a++) 
		{for(int b=7;b>a;b--)
		{System.out.print(" ");}
		for(int c=1;c<=a;c++)
		{
			System.out.print("* ");
		}System.out.println();
		}
		int y=100;
		while(y>=2)
		{System.out.println(y);
		y=y/2;}
		int b=100;
		while( b>=18) 
		{System.out.println(b);
		b=b/2;}
		
		for(int l=1;l<=7;l++) 
		{for(int m=7;m>l;m--)
		{System.out.print(" ");}
		for(int n=1;n<=l;n++) 
		{System.out.print("* ");}
		System.out.println();
		
		}
	
		
	}

}
