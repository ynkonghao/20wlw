public class TestBreak {
	public static void main(String[] args) {
		for(int i=1;i<20;i++) {
			if(i%5==0) {
				break;//结束整个循环
			}
			System.out.println(i);
		}
	}
}