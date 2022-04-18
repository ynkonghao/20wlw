package org.wlw.inter;

public class TestMonkey {
	public static void main(String[] args) {
		Monkey m = new GoldMonkey();
		m.climb();
		m.run();
		ProtectedAnimal pa = (ProtectedAnimal)m;
		pa.protect();
	}
}
