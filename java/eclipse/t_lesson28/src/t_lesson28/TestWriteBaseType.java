package t_lesson28;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//通过以下程序的编写，发现了两个问题：
//1、以字符串的形式来存储数据，文件的大小和字符个数有关系，而基本数据类型的大小应该固定，所以不合理
//2、操作字符串不方便，需要使用byte数组
public class TestWriteBaseType {
	public static void main(String[] args) {
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream("d:/test/data.txt"));
			int a = 1132322;//4
//			new Integer(a).toString()
			int b = 2232322;//4
			double d = 998979775.533456733556;//8
			dos.writeInt(a);
			dos.writeInt(b);
			dos.writeDouble(d);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos!=null) dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
