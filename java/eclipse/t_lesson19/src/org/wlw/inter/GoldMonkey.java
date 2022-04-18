package org.wlw.inter;

public class GoldMonkey implements Monkey,ProtectedAnimal{

	@Override
	public void run() {
		System.out.println("monkey run");
	}

	@Override
	public void climb() {
		System.out.println("monkey climb");
	}

	@Override
	public void protect() {
		System.out.println("monkey protected!");
	}

}
