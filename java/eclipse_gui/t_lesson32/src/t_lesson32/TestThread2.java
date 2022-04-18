package t_lesson32;

public class TestThread2 {
	public static void main(String[] args) {
		MyThread2 mt2 = new MyThread2();
		Thread t1 = new Thread(mt2,"t1");
		Thread t2 = new Thread(mt2,"t2");
		t1.start();
		t2.start();
//		for(int i=0;i<100;i++) {
//			System.out.println("main:"+i);
//		}
	}
}

class MyThread2 implements Runnable {
	int i = 0;
	@Override
	public void run() {
		for(;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}