//输出1-100之间能够同时被3和4整除的数
public class Test2 {
	public static void main(String[] args) {
		int n = 1;
		while(n<=100) {
			if(n%3==0&&n%4==0) {
				System.out.println(n);
			}
			n++;
		}
	}
}