
public class TestTree {
	public static void main(String[] args) {
		printTree(10);
	}
	
	public static void printTree(int level) {
		for(int i=1;i<=level;i++) {
			int spaces = level-i;
			for(int j=0;j<spaces;j++) {
				System.out.print(" ");
			}
			int stars = 2*i-1;
			for(int j=0;j<stars;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=1;i<=level;i++) {
			int spaces = level-1;
			for(int j=0;j<spaces;j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}
