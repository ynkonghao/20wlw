package org.wlw.en;

//封装指的是将所有的属性设置为private的，并且为每一个属性增加getter和setter方法来获取和设置值
public class User {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		if(age<=15) {
			this.age = -1;
		} else {
			this.age = age;
		}
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void playGame() {
		if(this.age<=0) {
			System.out.println(name+"你未达到玩游戏的年龄");
		} else {
			System.out.println(name+"正在玩游戏!");
		}
	}
}
