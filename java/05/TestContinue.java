public class TestContinue {
	public static void main(String[] args) {
		for(int i=1;i<20;i++) {
			if(i%5==0) {
				continue;//结束本次循环，直接进行条件判断
			}
			System.out.println(i);
		}
	}
}