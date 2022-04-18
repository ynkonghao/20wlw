package t_lesson12;

public class TestCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog("旺财",11);
		d1.show();
	}

}

class Dog {
	String name;
	int age;
	
	public Dog(String name,int age) {
//		System.out.println("dog con");
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(name+":"+age);
	}
}
