public class TestIf {
	public static void main(String[] args) {
		int ach = 48;
		//分支结构
		if(ach>=90) {
			System.out.println("小伙！考得不错!");
		} else if(ach>=80) {
			System.out.println("再细心一些就更好啦!");
		} else if(ach>=70) {
			System.out.println("小伙！再努努力!");
		} else if(ach>=60) {
			System.out.println("呼呼呼！刚好过关!");
		} else {
			System.out.println("哇哇哇！重修啦！天妒英才！");
		}
	}
}