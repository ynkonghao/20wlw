package t_lesson27;

import java.io.File;
import java.io.FileFilter;

public class TestFileListFilter {
	public static void main(String[] args) {
		File f = new File("d:/test");
		//匿名的内部类，这种方式都是使用在创建接口中，因为接口不能实例化对象，在new接口之后马上使用{}来完成抽象方法的实现。
		File[] files = f.listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				if(file.isFile()) {
					return true;
				}
				return false;
			}
		});
		for(File file:files) {
			System.out.println(file.getPath());
		}
	}
}
