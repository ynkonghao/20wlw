package org.wlw.lang;

public class TestString02 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = str1;
		str1+="a";
		//str1是一个新的内存空间，不会修改原有的空间
		System.out.println(str1);
		//str2的值依然是旧的值
		System.out.println(str2);
		
		//下面的写法是否合理？
		String str3 = "";
		//不合理，因为此时会分配100块空间，而真正有用的只有最后一个
		//所以要进行字符串的连加，不建议使用+=，建议使用StringBuffer来处理
		for(int i=0;i<1000000;i++) {
			str3+=i;
		}
//		System.out.println(str3);
	}
}
