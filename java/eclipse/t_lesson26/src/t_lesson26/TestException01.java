package t_lesson26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException01 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("d:/test");
		} catch(FileNotFoundException e) {
//			System.out.println("发现异常");
			e.printStackTrace();//打印异常
		}
		//Unhandled exception type  FileNotFoundException
	}
}
