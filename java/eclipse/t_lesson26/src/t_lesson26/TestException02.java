package t_lesson26;

public class TestException02 {
	public static void main(String[] args) {
		System.out.println("main begin");
		int num = divide(19,0);
		System.out.println(num);
		System.out.println("main end");
	}
	
	public static int divide(int a,int b) {
		int r = 0;
		try {
			System.out.println("begin divide");
			r = a/b;
			System.out.println("end divide");
		} catch(ArithmeticException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("divide func end");
		return r;
	}
}
