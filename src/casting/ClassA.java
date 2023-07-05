package casting;

public class ClassA {
	int a =120;
	int b =89;
	public void demo()
	{     int a=123;
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		ClassA a=new ClassA ();
		a.demo();
	}

}
