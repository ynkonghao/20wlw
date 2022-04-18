
public class TestRiceNoddle {
	public static void main(String[] args) {
		//new后面的代码其实是调用了一个函数，这个函数称为构造函数
		RiceNoddle rn = new RiceNoddle("中碗",true);
//		rn.bowlType = "大碗";
//		rn.moreMeat = false;
		rn.buy();
	}
}

/**
 * 每一个类都有一个默认的不带参数的构造函数，构造函数的特点：
 * 1、名称必须和类名完全一致
 * 2、构造函数的只能使用new来调用，也就是在创建对象的时候调用
 * 3、构造函数不写返回值（不是void）
 * 4、当程序员没有写任意构造函数的时候，java的虚拟机会自动创建一个不带参数的构造函数，在这个函数中什么都不做。
 *   如果手动编写了构造函数之后，java的虚拟机就不会再创建这个不带参数的构造函数了。
 * 构造函数的作用是在初始化的时候为对象的属性进行赋值。
 * */
class RiceNoddle {
	String bowlType;
	boolean moreMeat;
	
	public RiceNoddle(String b,boolean m) {
		System.out.println("rice");
		bowlType = b;
		moreMeat = m;
	}
	
	public void buy() {
		String m = "不加肉";
		if(moreMeat) {
			m = "加肉";
		}
		System.out.println("买了"+bowlType+"的"+m+"的羊肉米线");
	}
}
