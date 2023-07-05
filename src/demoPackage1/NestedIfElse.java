package demoPackage1;

public class NestedIfElse {
	public static void main(String[] args) {
		int a=120;
		int b=173;
		int c=23;
		if(a>b)
		{if (a>c)
		{System.out.println("a is greater = " + a);}
		else {System.out.println("c is greater = " + c);}
		}
		else {
			if(b>c)
			{System.out.println("b is greater = " + b);}
			else {System.out.println("c is greater = " +c);}
		}
		
	}

}
