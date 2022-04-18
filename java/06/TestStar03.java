public class TestStar03 {
	public static void main(String[] args) {
		int layer = 10;
		//输出顶部
		for(int i=1;i<=layer;i++) {
			//输出空格
			int spaces = layer-i;
			for(int j=0;j<spaces;j++) {
				System.out.print(" ");
			}
			//输出*号
			int stars = 2*i-1;
			for(int j=0;j<stars;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		//输出树干
		for(int i=1;i<=layer;i++) {
			int spaces = layer-1;
			for(int j=0;j<spaces;j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}