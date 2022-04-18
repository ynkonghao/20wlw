package org.wlw.test;

//传入一个文件名，获取文件的类型和文件的名称，如果不是文件，提示
public class TestFileType {
	public static void main(String[] args) {
		String f = "adfsdfsdfsdf.df.txt";
		showFileType(f);
		System.out.println(checkFileType("adfsdf.txt","java"));
	}
	
	public static void showFileType(String file) {
		int pos = file.lastIndexOf(".");
		if(pos<0) {
			System.out.println("传入的文件有误!");
			return;
		}
		System.out.println("file type:"+file.substring(pos+1));
		System.out.println("file name:"+file.substring(0,pos));
	}
	
	public static boolean checkFileType(String file,String type) {
//		if(file.endsWith(type)) {
//			return true;
//		}
//		return false;
		return file.endsWith(type);
	}
}
