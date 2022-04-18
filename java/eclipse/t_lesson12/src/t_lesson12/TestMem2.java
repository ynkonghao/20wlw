package t_lesson12;

public class TestMem2 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 30;
//		Person p2 = p1;
//		p2.age = 50;
//		System.out.println(p1.age);
		Person p2 = new Person();
		p2.age =40;
		swap(p1,p2);
		System.out.println(p1.age+","+p2.age);
	}
	
	public static void swap(Person pa,Person pb) {
//		Person p3 = pb;
//		pb = pa;
//		pa = p3;
		int a = pa.age;
		pa.age = pb.age;
		pb.age = a;
	}

}

class Person {
	int age;
}
