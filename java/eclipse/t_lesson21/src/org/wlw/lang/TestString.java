package org.wlw.lang;

public class TestString {
	public static void main(String[] args) {
		String str1 = "123";
		String str2 = "123";
		
		String str3 = new String("123");
		String str4 = new String("abc");
		
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equals(str3));
	}
}
