package t_eji;

public class TestThread {
	public static void main(String[] args) {
//		//新建了一个线程
//		MyThread mt = new MyThread();
//		mt.start();//此时启动线程
////		mt.run();//方法调用
//		Thread t = new Thread(new MyThread2());
//		t.start();
//		//main函数的方法
//		for(int i=0;i<500;i++) {
//			System.out.println("main:"+i);
//		}
		System.out.println(Math.round(12.6));
		
	}
}

class MyThread2 implements Runnable {
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("mt2:"+i);
		}
	}
}

class MyThread extends Thread {
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("mythead:"+i);
		}
	}
}
