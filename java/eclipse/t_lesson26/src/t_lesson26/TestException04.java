package t_lesson26;

public class TestException04 {
	public static void main(String[] args) {
		System.out.println("main begin");
		try {
			int num = divide(19,0);
			System.out.println(num);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			throw e;//抛出异常
		}
		System.out.println("main end");
	}
	
	public static int divide(int a,int b) {
		int r = 0;
		System.out.println("begin divide");
		r = a/b;
		System.out.println("end divide");
		System.out.println("divide func end");
		return r;
	}
}
