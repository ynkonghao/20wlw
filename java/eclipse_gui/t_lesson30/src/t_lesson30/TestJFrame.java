package t_lesson30;

import javax.swing.JFrame;

public class TestJFrame {
	public static void main(String[] args) {
		JFrame jf = new JFrame("你好hello jframe");
		System.out.println("大家好");
		jf.setSize(200, 200);
		jf.setLocation(100, 100);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}
