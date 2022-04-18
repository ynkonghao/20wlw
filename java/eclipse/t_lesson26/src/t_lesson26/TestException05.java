package t_lesson26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException05 {
	public static void main(String[] args) {
		
	}
	
	public static void test() throws FileNotFoundException{//函数的声明异常，这个函数可能发生哪些
		try {
			FileInputStream fis = new FileInputStream("d:/test");
		} catch(FileNotFoundException e) {
//			System.out.println("发现异常");
			e.printStackTrace();//打印异常
			throw e;//抛出异常
		}
		//Unhandled exception type  FileNotFoundException
	}
}
