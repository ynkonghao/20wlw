
public class TestMem {
	public static void main(String[] args) {
		int a = 10;
		int b = a;
		b = 20;
		System.out.println("a="+a+",b="+b);
		
		C c1 = new C();
		c1.c = 22;
		
		C c2 = c1;
		c2.c = 33;
		
		System.out.println(c1.c);
	}
}

class C {
	int c;
}