package t_lesson29;

public class TestFac {
	public static void main(String[] args) {
		//6! 6*5*4*3*2*1==> 6* 5! 
		System.out.println(calFac(5));
		System.out.println(calFac2(5));
	}
	//使用递归的好处是方便把复杂问题简单化，使用递归的坏处，效率极低，能不用递归就不要用递归
	public static int calFac(int n) {
		if(n==1) return 1;
		return n*calFac(n-1);
	}
	
	public static int calFac2(int n) {
		int f = 1;
		for(int i=n;i>=1;i--) {
			f*=i;
		}
		return f;
	}
}
