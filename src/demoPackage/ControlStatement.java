package demoPackage;

public class ControlStatement {
	public static void main(String[] args) 
	{
		int income=1000000;
		if (income>1000000) 
		{System.out.println("WE purchase home");}
		else if(income>500000)
		{System.out.println("We purchase car");}
		else if(income>100000)
		{System.out.println("We purchase bike");}
		else
		{System.out.println("We purchase bicycle");}
		
		int b=100;
		if(b>90) {System.out.println("div a");}
		else if(b>80)
		{System.out.println("div b");}
		else if(b>60)
		{System.out.println("div c");}
		
		int c=100;
		if(c>90)
		{System.out.println("div a");}
		else if(c>75)
		{System.out.println("div b");}
		else if(c>60)
		{System.out.println("div c");}
		else {System.out.println("div d");}
		
	}

}
