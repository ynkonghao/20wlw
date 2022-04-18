//输出1-100之间的所有数之和
public class Test3 {
	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		while(n<=100) {
			sum+=n;
			n++;
		}
		System.out.println(sum);
	}
}