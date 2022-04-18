package t_lesson26;

public class TestFinally {
	public static void main(String[] args) {
		try {
			System.out.println("打开文件");
			System.out.println("写文件");
			int a = 10;
			if(a>5) {
				throw new ArithmeticException();
			}
			System.out.println("保存文件");
			System.out.println("关闭文件");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally { //finally表示的是不管什么情况都会执行的代码
			System.out.println("finally");
		}
	}
}
