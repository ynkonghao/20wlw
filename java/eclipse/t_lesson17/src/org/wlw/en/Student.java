package org.wlw.en;

public class Student {
	private String name;
	private int age;
	private String no;
	private String address;
	
	
	
	public Student(String name, int age, String no, String address) {
		super();
		this.name = name;
		this.age = age;
		this.no = no;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
