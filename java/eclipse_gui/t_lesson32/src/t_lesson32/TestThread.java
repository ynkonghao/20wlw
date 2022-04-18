package t_lesson32;

public class TestThread {
	public static void main(String[] args) {
		MyThread1 mt1 = new MyThread1("mt1");
		MyThread1 mt2 = new MyThread1("mt2");
		mt1.start();//一定要使用start来启动
		mt2.start();
//		mt1.run();//并没有启动线程，而是函数调用
//		for(int i=0;i<100;i++) {
//			System.out.println("main:"+i);
////			Thread.yield();
////			try {
////				Thread.sleep(1);
////			} catch (InterruptedException e) {
////				e.printStackTrace();
////			}
//		}
	}
}

class MyThread1 extends Thread {
	public MyThread1(String name) {
		super(name);
	}
	boolean flag;
	int i = 0;
	public void run() {
		for(;i<100;i++) {
			if(flag) {
				break;
			}
			System.out.println(this.getName()+":"+i);
//			try {
//				Thread.sleep(1);
////				if(i%3==0) {
//				this.resume();
////				}
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			if(i==50) {
////				this.stop();//stop已经被禁用了，因为没有办法释放资源
//				dead();//可以在dead中进行资源的释放。
//			}
		}
	}
	
	public void dead() {
		//可以完成资源的释放。
		flag = true;
	}
}
