package t_lesson26;

public class TestException06 {
	public static void main(String[] args) {
		System.out.println("main begin");
		try {
			int num = divide(19,0);
			System.out.println(num);
		} catch(ArithmeticException e) {
			
		} catch(NullPointerException e) {
			
		} catch(Exception e) { //异常的捕获也是具备多态特性的，此处如果捕获了Exception就意味着所以Exception都会被捕获
			System.out.println(e.getMessage());
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
