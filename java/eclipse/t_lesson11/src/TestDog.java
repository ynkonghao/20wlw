
public class TestDog {
	public static void main(String[] args) {
		Dog d = new Dog(11,"旺财");
		d.bark();
		
		Dog d2 = new Dog();
	}
}

class Dog {
	//当一个变量是类的属性的时候，JVM会自动进行初始化操作，数字类型默认是0或者0.0，boolean类型默认是false
	//对象类型默认是null，char默认是''
	//属性初始化最好的位置应该是构造函数
	int age;
	String name;
	
	
	/***
	 * 在java的类中，是可以存在同名函数的，这个叫做函数的重载(overload)，函数的名称可以相同，但是参数的类型不能相同
	 */
	public Dog() {
		
	}
	
	public Dog(String n,int a) {
		
	}
	
	//Dog d = new Dog(12);
	public Dog(int a) {
		
	}
	
	//Dog d = new Dog("abc")
	public Dog(String n) {
		
	}
	
	//Dog d = new Dog("abc",33);下面这个程序没有形成函数的重载
//	public Dog(String abc,int age) {
//		
//	}
	
	public Dog(int a,String n) {
		age = a;
		name = n;
	}
	
	public void bark() {
		System.out.println(name+":"+age);
	}
}
