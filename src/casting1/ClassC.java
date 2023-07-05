package casting1;

public class ClassC {
	public static void main(String[] args) {
		ClassA sup= new ClassA ();
		sup.ariths();
		sup.demo();
		
		ClassB sub=new ClassB ();
		sub.ariths();
		sub.demo();
		
		ClassA cast = new ClassB ();
		cast.ariths();
		cast.demo();
		
	}

}
