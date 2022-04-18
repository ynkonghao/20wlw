package t_lesson30;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//创建一个用户Map<String,String>，第一个是用户名，第二个是密码。
//添加一组固定用户
public class TestLoginFrame extends JFrame {
	
	public static void main(String[] args) {
		new TestLoginFrame();
	}
	
	private JLabel jl1,jl2;
	private JTextField jtf1;
	private JPasswordField jpf1;
	private JButton jb1,jb2;
	private JPanel jp1,jp2,jp3;//默认布局是FlowLayout
	
	public TestLoginFrame() {
		this.setTitle("系统登录");
		this.setSize(330, 130);
		this.setLocation(200, 200);
		this.setResizable(false);//不能调整大小
		this.setLayout(new GridLayout(3,1));
		jp1 = new JPanel();
		jl1 = new JLabel("用户姓名:");
		jtf1 = new JTextField(20);
		jp1.add(jl1); jp1.add(jtf1);
		this.add(jp1);
		jp2 = new JPanel();
		jl2 = new JLabel("用户密码:");
		jpf1 = new JPasswordField(20);
		jp2.add(jl2); jp2.add(jpf1);
		this.add(jp2);
		jb1 = new JButton("登录");
		jb2 = new JButton("重置");
		jp3 = new JPanel();
		jp3.add(jb1); jp3.add(jb2);
		this.add(jp3);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
