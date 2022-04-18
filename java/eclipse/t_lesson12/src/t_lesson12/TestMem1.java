package t_lesson12;

public class TestMem1 {
	public static void main(String[] args) {
		int a = 10;
		int b = a;
		b = 20;
		System.out.println("a="+a+",b="+b);
		swap(a,b);
		System.out.println("a="+a+",b="+b);
	}
	
	public static void swap(int a,int b) {
		int z = a;
		a = b;
		b = z;
	}
}