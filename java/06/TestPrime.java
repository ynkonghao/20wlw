public class TestPrime {
	public static void main(String[] args) {
		int num = 379;
		boolean flag = true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println(num+"是质数!");
		} else {
			System.out.println(num+"不是质数!");
		}
	}
}