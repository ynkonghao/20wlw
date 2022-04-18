package t_lesson31;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TestLogin extends JFrame{
	private Map<String,String> users;
	
	private JPanel jp1,jp2,jp3;
	private JLabel jl1,jl2;
	private JTextField jtf;
	private JPasswordField jpf;
	private JButton jb1,jb2;
	
	public static void main(String[] args) {
		new TestLogin();
	}
	
	public TestLogin() {
		users = new HashMap<String,String>();
		users.put("admin", "123");
		users.put("c10", "234");
		users.put("leon", "111");
		users.put("chris", "3232");
		
		this.setTitle("登录界面");
		this.setLocation(200, 200);
		this.setSize(400,180);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(3, 1));
		jp1= new JPanel();
		jl1 = new JLabel("用户名:");
		jtf = new JTextField(20);
		jp1.add(jl1); jp1.add(jtf);
		
		jp2 = new JPanel();
		jl2 = new JLabel("密    码:");
		jpf = new JPasswordField(20);
		jp2.add(jl2);jp2.add(jpf);
		
		jp3 = new JPanel();
		jb1 = new JButton("登录");
		jb2 = new JButton("重置");
		jb1.addActionListener(new BtnClick());
		jb2.addActionListener(new BtnClick());
		jp3.add(jb1); jp3.add(jb2);
		
		this.add(jp1);this.add(jp2);this.add(jp3);
		this.setVisible(true);
	}
	
	class BtnClick implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==jb1) {
				String username = jtf.getText();
				if(!users.containsKey(username)) {
					System.out.println("用户名不存在!");
					return;
				}
				String pwd = new String(jpf.getPassword());
//				System.out.println(pwd);
				if(!users.get(username).equals(pwd)) {
					System.out.println("用户密码错误!");
					return;
				}
				System.out.println("欢迎"+username+"登录我们的系统");
			} else if(e.getSource()==jb2) {
				jtf.setText("");
				jpf.setText("");
			}
		}
	}
}
