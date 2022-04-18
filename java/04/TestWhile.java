public class TestWhile {
	public static void main(String[] args) {
		int n = 1;
		//n=100 n++ n=101
		while(n<=100) {
			if(n%7==0) {
				System.out.println(n);
			}
			n++;
		}
	}
}