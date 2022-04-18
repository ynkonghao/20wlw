public class TestStar01 {
	public static void main(String[] args) {
		int layer = 7;
		for(int i=0;i<layer;i++) {
			int stars = 2*i+1;
			for(int j=0;j<stars;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}