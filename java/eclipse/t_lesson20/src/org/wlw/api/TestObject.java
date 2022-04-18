package org.wlw.api;

//创建一个学生类，有学号和姓名，输出学生对象的时候，直接打印学生的基本信息，如果两个学生的学生，对象就相等（equals）

public class TestObject {
	public static void main(String[] args) {
		Person p1 = new Person("a",1);
		Person p2 = new Person("a",2);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		//当直接输出一个对象的时候，默认调用的是对象toString方法
		System.out.println(p1);
	}
}

class Person {
	String name;
	int id;
	
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		Person p1 = (Person)obj;
		if(this.id==p1.id) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Id:"+this.id+",name:"+this.name;
	}
}
