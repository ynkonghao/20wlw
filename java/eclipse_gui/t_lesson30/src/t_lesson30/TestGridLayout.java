package t_lesson30;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestGridLayout extends JFrame{
	
	public static void main(String[] args) {
		new TestGridLayout();
	}
	
	private JButton jb1,jb2,jb3;
	private JTextField jtf1,jtf2;
	
	public TestGridLayout() {
		this.setTitle("测试GridLayout");
		this.setSize(400, 400);
		this.setLocation(200,200);
		this.setLayout(new GridLayout(3, 2));
		jb1 = new JButton("用户名:");
		jtf1 = new JTextField(10);
		this.add(jb1);this.add(jtf1);
		jb2 = new JButton("用户密码:");
		jtf2 = new JTextField();
		this.add(jb2); this.add(jtf2);
		jb3 = new JButton("确认");
		this.add(jb3);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
