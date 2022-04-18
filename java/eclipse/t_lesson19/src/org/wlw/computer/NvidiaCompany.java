package org.wlw.computer;

public class NvidiaCompany implements VideoCard{
	String type;
	
	public NvidiaCompany(String type) {
		this.type = type;
	}
	
	@Override
	public void display() {
		System.out.println("Nvidia VideoCard "+type+" is displaying!");
	}
}
