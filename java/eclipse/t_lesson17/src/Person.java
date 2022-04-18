//类和属性修饰关键字:private default(什么不写) protected public
//private修饰的属性，只能在同一个类中可以访问，出了类就不能被访问
//default修饰的属性，只能在同一个包中可以访问，不同包就无法访问
//protected修饰的属性，同一包可以访问，不同包的子类可以访问
//public修饰的属性，全部都可以访问

//public >protected>default>private 为了保证系统开发的安全性，能够使用private就不要使用default，尽可能使用小范围的访问
public class Person {
	private int a;
	int b;
	
	public void testA() {
		a = 10;
		b = 20;
	}
}
