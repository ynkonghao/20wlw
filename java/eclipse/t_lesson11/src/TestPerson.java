
public class TestPerson {
	public static void main(String[] args) {
		int a = 20;
		Person p1 = new Person();
		p1.age = 22;
		p1.show();
		
		Person p2 = p1;
		p2.age = 33;
		p2.show();
		
		p1.show();
		
		p2 = new Person();
		p2.show();
		
		p1 = p2;
		
		p1.age = 98;
		p2.show();
	}
}

class Person {
	int age;
	
	public void show() {
		System.out.println(age);
	}
}
