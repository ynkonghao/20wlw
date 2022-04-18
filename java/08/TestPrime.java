public class TestPrime {
	public static void main(String[] args) {
		System.out.println(isPrime(189));
		System.out.println(rangePrimeSum(50,199));
	}

	public static boolean isPrime(int num) {
		//boolean flag = true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		//return flag;
	}

	public static int rangePrimeSum(int start,int end) {
		int sum = 0;
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				sum+=i;
			}
		}
		return sum;
	}
}