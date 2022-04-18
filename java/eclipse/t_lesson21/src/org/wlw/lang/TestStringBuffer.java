package org.wlw.lang;

public class TestStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println(sb1==sb2);
		System.out.println(sb1.toString().equals(sb2.toString()));
		for(int i=0;i<1000000;i++) {
			sb1.append(i);
		}
//		System.out.println(sb.toString());
	}
}
