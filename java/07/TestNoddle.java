public class TestNoddle {
	public static void main(String[] args) {
		System.out.println("---------早餐，吃一碗面--------");
		makeNoddle("");
		System.out.println("----------午餐，准备吃一碗面--------");
		makeNoddle("牛肉");
		System.out.println("----------晚餐，还是要吃一碗面--------");
		makeNoddle("小米辣");
	}

	public static void makeNoddle(String addon) {
		System.out.println("烧水");
		System.out.println("配料");
		System.out.println("下面");
		if(addon!="") {
			System.out.println("加点"+addon);
		}
		System.out.println("捞面");
		System.out.println("一碗香喷喷的面条好了!");
	}
}