package t_lesson10;

public class TestObject {
	public static void main(String[] args) {
		Dog dog = new Dog();//创建了一个Dog的对象，dog这个变量就是一个对象
		dog.name = "旺财";
		dog.age = 7;
		dog.bark();
	}
}

class Dog {
	public String name;
	public int age;
	
	public void bark() {
		if(age<2) {
			System.out.println(name+":叽叽叽!");
		} else if(age<11) {
			System.out.println(name+":旺旺旺!");
		} else {
			System.out.println(name+":呜呜呜!");
		}
	}
}
