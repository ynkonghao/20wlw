package t_lesson30;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestChat extends JFrame{
	
	private JButton jb1;
	private JTextArea jta;
	private JPanel jp1;
	private JTextField jtf;
	private JScrollPane jsp;//滚动条
	
	public static void main(String[] args) {
		new TestChat();
	}
	
	public TestChat() {
		this.setTitle("聊天");
		this.setSize(500, 500);
		this.setLocation(200, 200);
		
		jta = new JTextArea();
		jsp = new JScrollPane(jta);//创建滚动条的时候需要确认一个组件
		this.add(jsp);
		
		jp1 = new JPanel();
		jtf = new JTextField(30);
		jb1 = new JButton("发送");
		jp1.add(jtf);
		jp1.add(jb1);
		this.add(jp1,BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
