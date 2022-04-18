public class TestFor {
	public static void main(String[] args) {
		//for(A;B;C)
		//A只会执行一次，所以一般用来做变量初始化
		//B是条件判断
		//C是每次循环完成都要进行判断
		for(int n=1;n<=100;n++) {
			if(n%2==0) {
				System.out.println(n);
			}
		}
	}
}