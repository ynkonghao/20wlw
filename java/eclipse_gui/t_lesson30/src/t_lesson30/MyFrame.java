package t_lesson30;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	JButton jb1,jb2,jb3,jb4,jb5;
	
	public static void main(String[] args) {
		new MyFrame("hello gui");
	}
	
	public MyFrame(String title) {
		this.setTitle(title);
		this.setSize(300, 300);
		this.setLocation(200, 200);
		this.setLayout(new BorderLayout(3,5));
		
		jb1 =new JButton("北方");
		jb2 = new JButton("南方");
		jb3 = new JButton("西方");
		jb4 = new JButton("东方");
		jb5 = new JButton("中心");
		this.add(jb1,BorderLayout.NORTH);//由于JFrame默认的布局管理器是BordLayout
		//BordLayout管理器使用的是上北下南左西右东和中心的方式来设定，默认都是添加在Center中
		this.add(jb2,BorderLayout.SOUTH);
		this.add(jb3,BorderLayout.WEST);
		this.add(jb4,BorderLayout.EAST);
		this.add(jb5,BorderLayout.CENTER);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
