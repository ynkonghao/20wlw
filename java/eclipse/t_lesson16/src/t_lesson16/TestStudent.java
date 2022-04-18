package t_lesson16;

public class TestStudent {
	public static void main(String[] args) {
		MiddleStudent ms = new MiddleStudent("小李",2019);
//		ms.name = "小明";
		ms.study();
		
		Student stu = new Student("小王");
	}
}

class Student {
	//创建子类时会自动调用父类不带参数的构造函数来创建，如果父类没有不带参数的构造函数，就需要进行手动构造
	public Student(String name) {
		this.name = name;
		System.out.println("student is constructor!");
	}
	
	String name;
	
	public void study() {
		System.out.println(name+"正在读书!");
	}
}

class MiddleStudent extends Student{
	
	int grade;
	String name;
	
	public MiddleStudent(String name,int grade) {
//		System.out.println();
		//构造父类，super必须放在构造函数的第一行
		super(name);
		this.grade = grade;
	}
	
	public MiddleStudent() {
		super("老王");
	}
	
	public void study() {
		System.out.println(super.name+"正在背书!年级是:"+grade);
	}
}
