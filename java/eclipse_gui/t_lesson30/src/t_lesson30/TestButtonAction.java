package t_lesson30;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestButtonAction extends JFrame{
	private JButton jb1;
	private JButton jb2;
	
	public static void main(String[] args) {
		new TestButtonAction();
	}
	
	
	public TestButtonAction() {
		this.setTitle("按钮事件");
		this.setSize(200, 200);
		this.setLocation(100, 100);
		this.setLayout(new FlowLayout());
		jb1 = new JButton("hello");
		//为按钮添加点击事件。
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("you click hello");
			}
		});
		jb2 = new JButton("world");
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("you click world");
			}
		});
		this.add(jb1); this.add(jb2);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
		this.setVisible(true);
	}

}
