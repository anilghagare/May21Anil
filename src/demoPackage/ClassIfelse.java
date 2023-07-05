package demoPackage;

public class ClassIfelse 
{
	public static void main(String[] args) 
	{
		int a=20;
		int b=20;
		if (a>=10) 
		{
			System.out.println("a is greater than or equal to 10");
		}
		else 
		{
			System.out.println("a is smaller than 10");
		}
		
		//if   else if
		
		float marks=90.5f;
		if (marks >75)
		{
			System.out.println("Take admission to sci");
		}
		else if (marks >60) 
		{
			System.out.println("Take admission to com");
			}
		else if (marks >45) 
		{
			System.out.println("Take admission to art");
		}
		else
		{
			System.out.println("You are failed");
		}
		
	}

}
