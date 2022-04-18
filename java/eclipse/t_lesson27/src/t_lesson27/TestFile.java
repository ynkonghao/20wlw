package t_lesson27;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		try {
			File f = new File("d:/test/20wlw/test.a");
			System.out.println(f.exists());//判断文件是否存在
//		f.mkdir();//只能创建一级不存在的目录
//		f.mkdirs();//可以创建多级不存在的目录
//		f.delete();//如果要删除目录，只要目录不为空，都无法删除。
			f.createNewFile();
//			f.delete();//文件可以直接删除，文件夹的删除要进行递归操作。
//			System.out.println(f.getAbsolutePath());
//			System.out.println(f.getPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
