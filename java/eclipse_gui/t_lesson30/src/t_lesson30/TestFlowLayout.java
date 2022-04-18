package t_lesson30;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFlowLayout extends JFrame{
	
	public static void main(String[] args) {
		new TestFlowLayout();
	}
	
	private JButton jb1,jb2,jb3;
	
	public TestFlowLayout() {
		this.setTitle("测试FlowLayout");
		this.setSize(400, 400);
		this.setLocation(200,200);
		this.setLayout(new FlowLayout());
		jb1 = new JButton("流行音乐");
		jb2 = new JButton("摇滚音乐");
		jb3 = new JButton("民谣");
		this.add(jb1);this.add(jb2);this.add(jb3);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
