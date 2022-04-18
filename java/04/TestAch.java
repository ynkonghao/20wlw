public class TestAch {
	public static void main(String[] args) {
		int ach = 59;
		switch (ach/10) {
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("ßÀßÀßÀ!");
				break;
		}
	}
}