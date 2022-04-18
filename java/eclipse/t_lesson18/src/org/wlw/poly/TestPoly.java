package org.wlw.poly;

/**
 * 编写多态的条件：
 * 1、有继承
 * 2、有方法的覆盖
 * 3、父类引用指向子类对象
 * */
public class TestPoly {

	public static void main(String[] args) {
		Student stu = new MiddleStudent();
		stu.name = "laozhang";
		MiddleStudent ms = (MiddleStudent)stu;//强制将stu转换为MiddleStudent
		//对象的强制类型转换是有条件的，就是需要父类引用指向子类对象。可以把父类引用转换为子类，用来调用子类自己的方法或者属性
		ms.age = 10;
//		Person p = (Person)stu;
		stu.study();
		ms.study();
	}

}

class Person {
	
}

class Student {
	String name;
	
	public void study() {
		System.out.println(name+"正在学习!");
	}
}

class MiddleStudent extends Student {
	int age;
	public void study() {
		System.out.println(name+"正在用力背书!");
	}
}
