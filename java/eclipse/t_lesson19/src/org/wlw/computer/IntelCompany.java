package org.wlw.computer;

public class IntelCompany implements CPU,VideoCard{
	String type;
	
	public IntelCompany(String type) {
		this.type = type;
	}

	@Override
	public void run() {
		System.out.println("Intel CPU "+type+" start");
	}

	@Override
	public void display() {
		System.out.println("Intel VideoCard "+type+" is displaying!");
		
	}

}
