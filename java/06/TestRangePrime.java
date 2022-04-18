public class TestRangePrime {
	public static void main(String[] args) {
		//输出2-150之间的所有质数
		for(int i=2;i<150;i++) {
			//判断i是否是质数
			boolean flag = true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(i);
			}
		}
	}
}