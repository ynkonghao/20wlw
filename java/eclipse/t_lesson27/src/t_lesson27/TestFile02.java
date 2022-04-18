package t_lesson27;

import java.io.File;

public class TestFile02 {
	public static void main(String[] args) {
		//byte BIT  byte=8BIT--->500MB BIT的网线
		File f = new File("d:/test/20wlw");
		System.out.println(f.length()/1024);//获取文件的大小,如果是文件夹，无法获取大小
		System.out.println(f.getName());//获取文件名
		System.out.println(f.isDirectory());//判断是否是文件夹
		System.out.println(f.isFile());//判断是否是文件
		f.renameTo(new File("d:/test/20wlw1"));//重命名
	}
}
