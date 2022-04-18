package org.wlw.stu;

public class TestArray2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		swap(a,b);
		System.out.println(a+","+b);
		A a1 = new A();
		a1.n = 10;
		A a2 = new A();
		a2.n = 20;
		swap(a1,a2);
		System.out.println(a1.n);
		System.out.println(a2.n);
		int[] num = new int[] {10,20};
		swap(num);
		System.out.println(num[0]+","+num[1]);
	}
	
	public static void swap(int[] num) {
		int t = num[0];
		num[0] = num[1];
		num[1] = t;
	}
	
	public static void swap(A a1,A a2) {
		int t = a1.n;
		a1.n = a2.n;
		a2.n = t;
	}
	
	public static void swap(int a,int b) {
		int z = a;
		a = b;
		b = z;
	}
}

class A {
	int n;
}
