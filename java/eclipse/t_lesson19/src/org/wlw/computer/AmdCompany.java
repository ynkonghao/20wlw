package org.wlw.computer;

public class AmdCompany implements VideoCard,CPU{
	String type;
	
	public AmdCompany(String type) {
		this.type = type;
	}
	
	@Override
	public void run() {
		System.out.println("Amd "+type+" CPU is runding");
	}

	@Override
	public void display() {
		System.out.println("Amd "+type+" Videocard is displaying" );
	}

}
