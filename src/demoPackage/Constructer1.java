package demoPackage;

public class Constructer1 {
static int a;           // default constructer
static float f;
static char c;
static boolean b;
static String s;

Constructer1()       // zero argument
{ a=10;
 f=10.5f;
 c='e';
 b =true;
 s ="velocity Testing";}
 
 
 Constructer1(char g)      //with argument
 { a=90;
  f=90.5f;
  c='w';
  b =false;
  s ="velocity Testing class";
	}
public static void main(String[] args)
    {System.out.println(a);
    System.out.println(f);
    System.out.println(c);
    System.out.println(b);
    System.out.println(s);
    
    new Constructer1();
    
    System.out.println(a);
    System.out.println(f);
    System.out.println(c);
    System.out.println(b);
    System.out.println(s);
    
 new Constructer1('k');
    
    System.out.println(a);
    System.out.println(f);
    System.out.println(c);
    System.out.println(b);
    System.out.println(s);
    
    
    
	}
}
