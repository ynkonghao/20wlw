package t_lesson30;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestButtonAction2 extends JFrame{
	private JButton jb1;
	private JButton jb2;
	
	public static void main(String[] args) {
		new TestButtonAction2();
	}
	
	
	public TestButtonAction2() {
		this.setTitle("按钮事件");
		this.setSize(200, 200);
		this.setLocation(100, 100);
		this.setLayout(new FlowLayout());
		jb1 = new JButton("hello");
		jb2 = new JButton("world");
		jb1.addActionListener(new BtnClick());
		jb2.addActionListener(new BtnClick());
		this.add(jb1); this.add(jb2);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
		this.setVisible(true);
	}
	
	//统一将监听程序写在内部类里面
	class BtnClick implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
//			e.getSource()==jb1;//得到触发事件的对象
			if(e.getSource()==jb1) {
				System.out.println("you click hello!");
			} else if(e.getSource()==jb2) {
				System.out.println("you click world!");
			}
		}
		
	}
}