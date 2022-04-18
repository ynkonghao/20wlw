package org.wlw.poly;

public class TestDiver {
	public static void main(String[] args) {
		Vehicle v = new Car("大奔驰");
		Vehicle e = new Elephent("非洲象");
		Driver d = new Driver("老张",e);
		d.go("东北");
	}
}

class Driver {
	String name;
	Vehicle vehicle;
	
	public Driver(String name, Vehicle vehicle) {
		super();
		this.name = name;
		this.vehicle = vehicle;
	}

	public void go(String address) {
		vehicle.run();
		System.out.println(name+"驾驶着"+vehicle.name+"去"+address);
	}
}

class Vehicle {
	String name;
	
	public Vehicle(String name) {
		this.name = name;
	}
	
	//启动
	public void run() {
		
	}
}

class Car extends Vehicle {
	public Car(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("噗噗噗噗噗!");
	}
}

class Elephent extends Vehicle {
	public Elephent(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println("轰轰轰轰!");
	}
}
