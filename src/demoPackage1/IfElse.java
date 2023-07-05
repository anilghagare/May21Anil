package demoPackage1;

public class IfElse {
	public static void main(String [] args)
	{
		int a=50;
		if( a>70)
		{System.out.println("Admission to science");
			if( a>80)
		{System.out.println("Div A");}
			else if(a>75)
			{System.out.println("Div B");}
			else {System.out.println("Div C");}
			}
		else if (a>55)
		{System.out.println("Addmission to Commerce");
		if(a>65)
			{System.out.println("Div A");}
		else if(a>60)
			{System.out.println("Div B");}
		else{System.out.println("Div C");}}
		else {
			System.out.println(" Admision to Arts");
		}
		
	}

}
