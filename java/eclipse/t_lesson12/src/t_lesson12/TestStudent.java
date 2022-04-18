package t_lesson12;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "zs";
		//cla是static声明的，不再属于对象，而属于类，这种变量虽然使用对象来调用不会报错，但是在编写的时候不能这样写，要用类来调用
//		s1.cla = "20物联网";
		Student.cla = "20物联网";
		Student s2 = new Student();
		s2.name = "ls";
//		s2.cla = "19物联网";
		Student.cla = "19物联网";
		s1.show();
		s2.show();
	}
}

class Student {
	String name;
	static String cla;
	
	public void show() {
		System.out.println(this.name+","+Student.cla);
	}
}
