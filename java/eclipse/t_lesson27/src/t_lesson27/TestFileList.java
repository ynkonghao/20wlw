package t_lesson27;

import java.io.File;

public class TestFileList {
	public static void main(String[] args) {
		File f = new File("d:/test");
//		String[] files = f.list();//把f文件夹中的所有文件的名称存在一个字符串数组中
//		for(String file:files) {
//			System.out.println(file);
//		}
		File[] fs = f.listFiles();
		for(File file:fs) {
//			if()//遍历出文件夹中的所有java文件
			//遍历所有的java文件
//			if(file.getName().endsWith(".java")) {
//				System.out.println(file.getName());
//			}
			if(file.isDirectory()) {
				System.out.println(file.getName());
			}
		}
	}
}
