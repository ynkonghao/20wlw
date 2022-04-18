package t_lesson28;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//通过以下程序的编写，发现了两个问题：
//1、以字符串的形式来存储数据，文件的大小和字符个数有关系，而基本数据类型的大小应该固定，所以不合理
//2、操作字符串不方便，需要使用byte数组
public class TestWriteBaseType02 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("d:/test/data.txt");
			int a = 1132322;//4
//			new Integer(a).toString()
			int b = 2232322;//4
			double d = 998979775.533456733556;//8
			fos.write((a+"\n").getBytes());
			fos.write((b+"\n").getBytes());
			fos.write((d+"\n").getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos!=null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
