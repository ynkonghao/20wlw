package org.wlw.computer;

public class MainBoard {
	String band;
	VideoCard vc;
	CPU cpu;
	
	public void start() {
		System.out.println(band+" runing!");
		cpu.run();
		vc.display();
		System.out.println("win10 starting!");
	}
}
