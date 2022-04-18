
public class TestSumRange {

	public static void main(String[] args) {
		System.out.println(getRangeSum(10,90,17));
	}
	
	public static int getRangeSum(int start,int end,int div) {
		int sum = 0;
		for(int i=start;i<=end;i++) {
			if(i%div==0) {
				sum+=i;
			}
		}
		return sum;
	}

}
