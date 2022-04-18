package org.wlw.computer;

//下去把内存加上

public class TestCompany {
	public static void main(String[] args) {
		MainBoard mb = new MainBoard();
		mb.band = "华硕ITX9500";
		IntelCompany cpu = new IntelCompany("i7 8700");
		NvidiaCompany vc = new NvidiaCompany("七彩虹3960");
		AmdCompany acpu = new AmdCompany("毒龙6700");
		AmdCompany avc = new AmdCompany("9800");
		mb.cpu = acpu;
		mb.vc = new IntelCompany("3700");
		mb.start();
		
	}
}
