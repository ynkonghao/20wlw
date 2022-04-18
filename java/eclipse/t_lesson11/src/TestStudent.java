
public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student("小张","001");
		s1.show();
	}
}

class Student {
	String name;
	String no;
	
	public Student(String name,String no) {
		name = name;
		no = no;
	}
	
	public void show() {
		System.out.println(name+","+no);
	}
}
