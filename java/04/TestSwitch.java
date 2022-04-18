public class TestSwitch {
	public static void main(String[] args) {
		char level = 'B';
		//switch后面的变量，必须是整数，char其实也是一个整数
		//switch case只能比较等于
		switch (level) {
			case 'A':
				System.out.println("考得很好!");
				break;
			case 'B':
				System.out.println("考得不错！");
				break;
			case 'C':
				System.out.println("刚好及格!");
				break;
			case 'D':
				System.out.println("需要多努力!");
				break;
			default:
				System.out.println("学习不用功!");
				break;
		}
	}
}