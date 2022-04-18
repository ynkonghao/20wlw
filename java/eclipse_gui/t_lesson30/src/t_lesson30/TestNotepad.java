package t_lesson30;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TestNotepad extends JFrame{

	public static void main(String[] args) {
		new TestNotepad();
	}
	private JMenuBar jmb;
	private JMenu jm1,jm2,jm3,jm4;
	private JMenuItem jmi11,jmi12,jmi13,jmi14;
	private JMenuItem jmi21,jmi22,jmi23;
	private JMenuItem jmi31,jmi32,jmi33;
	private JTextArea jta;
	private JScrollPane jsp;
	
	public TestNotepad() {
		this.setTitle("记事本");
		this.setSize(600, 600);
		this.setLocation(200,200);
		
		jmb = new JMenuBar();
		jm1 = new JMenu("文件");
		jmi11 = new JMenuItem("打开");
		jmi12 = new JMenuItem("保存");
		jmi13 = new JMenuItem("新建");
		jmi14 = new JMenuItem("关闭");
		jm1.add(jmi11); jm1.add(jmi12); jm1.add(jmi13); jm1.add(jmi14);
		jmb.add(jm1);
		
		jm2 = new JMenu("编辑");
		jmi21 = new JMenuItem("复制");
		jmi22 = new JMenuItem("剪切");
		jmi23 = new JMenuItem("粘贴");
		jm2.add(jmi21); jm2.add(jmi22); jm2.add(jmi23);
		jmb.add(jm2);
		
		jm3 = new JMenu("帮助");
		jm4 = new JMenu("版本");
		jmi31 = new JMenuItem("版本信息");
		jmi32 = new JMenuItem("帮助信息");
		jmi33 = new JMenuItem("升级检测");
		jm4.add(jmi31); jm4.add(jmi33);
		jm3.add(jmi32);
		jm3.add(jm4);
		jmb.add(jm3);
		this.add(jmb,BorderLayout.NORTH);
		
		jta = new JTextArea();
		jsp = new JScrollPane(jta);
		this.add(jsp);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
