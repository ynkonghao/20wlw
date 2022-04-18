public class TestDiamond {
	public static void main(String[] args) {
		int layer = 8;
		for(int i=1;i<=8;i++) {
			int spaceNum = layer-i;
			for(int j=0;j<spaceNum;j++) {
				System.out.print(" ");
			}
			int starNum = 2*i-1;
			for(int j=0;j<starNum;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		for(int i=layer-1;i>0;i--) {
			int spaceNum = layer-i;
			for(int j=0;j<spaceNum;j++) {
				System.out.print(" ");
			}
			int starNum = 2*i-1;
			for(int j=0;j<starNum;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}