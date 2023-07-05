package demoPackage;

public class Arrays {
	public static void main(String[] args) {
		int a []= {10,20,30,40,50,60,70,80,90,100};
		int size =a.length;
		
		System.out.println(size);
		for(int i=0;i<a.length;i++)
		{System.out.println(a[i]);}
		
		
		//array declaration and initialisation seperately 
		//Data type variable name []=new data type [size]
		int b[]=new int [4];
		b[0]=10;
		b[1]=20;
		b[2]=30;
		b[3]=40;
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
	//	char c[]=new char[4];
		
				
		
	}

}
