package t_lesson29;

public class TestFib {
	public static void main(String[] args) {
		System.out.println(calFib1(45));
		System.out.println(calFib2(45));
	}
	
	public static int calFib1(int n) {
		if(n==1) return 1;
		if(n==2) return 2;
		return calFib1(n-1)+calFib1(n-2);
	}
	
	public static int calFib2(int n) {
		if(n==1) return 1;
		if(n==2) return 2;
		int a = 1;
		int b = 2;
		int c = 0;
		for(int i=3;i<=n;i++) {
			c = a+b;
			a = b;
			b = c;
		}
		return c;
	}
}
