package org.wlw.lang;
//写一个函数，用来获取一个文件的文件名和文件类型，如果不是一个有效的文件请输出相应的提示 showFileType
//设计一个函数，判断某个文件是否属于某种类型 checkFileType
//验证方法:toLowerCase(),trim(),toUpperCase()
public class TestString03 {
	public static void main(String[] args) {
		String s1 = "hello world!";
		System.out.println(s1.charAt(1));
		System.out.println(s1.length());
		String file = "sdfs.dfsf.txt";//判断是否是.java的文件？
		System.out.println(file.endsWith(".java"));
		System.out.println(file.indexOf("sss"));
		//获取一个文件的类型
		//1、找.的位置
		int pos = file.lastIndexOf(".");
		System.out.println(file.indexOf("."));
		//2、从.的位置截取字符串
		System.out.println(file.substring(pos+1));
	}
}
