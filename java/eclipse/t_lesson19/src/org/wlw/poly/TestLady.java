package org.wlw.poly;

public class TestLady {
	public static void main(String[] args) {
		Dog d = new Dog("小强");
		Cat c = new Cat("小花");
		Bear b = new Bear("黑风怪");
		Animal s = new Snake("花精");
		RichLady lady = new RichLady("菜同学",s);
		lady.play();
	}
}

class RichLady {
	String name;
	Animal animal;
	
	public RichLady(String name,Animal animal) {
		this.name = name;
		this.animal = animal;
	}
	
	public void play() {
		System.out.println(name+"正在逗"+animal.name);
		animal.enjoy();
	}
}

abstract class Animal {
	String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	//存在的意义只有一个！就是用来被子类覆盖，可以把这个方法设置为抽象方法
	public abstract void enjoy();
}

class Snake extends Animal {
	public Snake(String name) {
		super(name);
	}
	
	public void enjoy() {
		System.out.println(name+":别碰我！小心毒死你!");
	}
}

class Bear extends Animal {
	public Bear(String name) {
		super(name);
	}
	
	public void enjoy() {
		System.out.println(name+":别惹我！小心拍死你!");
	}
}

class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
	
	public void enjoy() {
		System.out.println(name+":别动我！小心挠死你!");
	}
}

class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}
	
	public void enjoy() {
		System.out.println(name+":旺财旺财旺财!");
	}
}
