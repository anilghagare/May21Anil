package demoPackage;

public class LogicalOperater 
{
	public static void main(String[] args) 
	{
		//and 
		boolean a=true;
		boolean b=false;
		boolean c=a&&b;
		System.out.println(c);
	    c=(5<7)&&(3>2);
	    System.out.println(c);
	    c=(7==7)&&(7!=7);
	    System.out.println(c);
		
	    //or
	    c=a||b;
	    System.out.println(c);
	    c=(5>3)||(7<4);
	    System.out.println(c);
	    c=(5==5)||(2!=2);
	    System.out.println(c);
	    System.out.println("---------------------");
	    boolean x=true;
	    boolean y=true;
	    boolean z=x&&y;
	    System.out.println(z);
	    z=(7==8)||(9!=8);
	    System.out.println(z);
	    z=(3<5)||(5!=4);
	    System.out.println(z);
	    z=(13==13)||(9>5);
	    System.out.println(z);
	    
		
	}

}
