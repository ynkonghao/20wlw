package t_lesson30;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class TestAction extends JFrame{
	
	public static void main(String[] args) {
		new TestAction();
	}
	
	public TestAction() {
		this.setTitle("测试事件");
		this.setSize(200, 200);
		this.setLocation(200, 200);
		//使用WindowAdapter的意义是不用完全实现接口中的所有代码
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
		
		this.setVisible(true);
	}

}
