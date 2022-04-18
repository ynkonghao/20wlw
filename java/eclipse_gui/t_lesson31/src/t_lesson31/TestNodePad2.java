package t_lesson31;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;



public class TestNodePad2 extends JFrame{
	
	private TestNodePad2 root;
	private JTextArea jta;
	private JScrollPane jsp;
	private JPanel jp;
	private JTextField jtf;
	private JButton jb;
	private JMenuBar jmb;
	private JMenu jm1,jm2,jm3;
	private JMenuItem jmi1,jmi2,jmi3,jmi4,jmi5,jmi6,jmi7,jmi8;
	
	public static void main(String[] args) {
		new TestNodePad2();
	}
	
	public TestNodePad2() {
		root = this;
		this.setTitle("无标题 记事本");
		this.setLocation(200, 100);
		this.setSize(600, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jmb = new JMenuBar();
		jm1 = new JMenu("文件");
		jmi1 = new JMenuItem("新建");
		jmi2 = new JMenuItem("打开");
		jmi3 = new JMenuItem("保存");
		jmi1.addActionListener(new MenuClick());
		jmi2.addActionListener(new MenuClick());
		jmi3.addActionListener(new MenuClick());
		jm1.add(jmi1); jm1.add(jmi2); jm1.add(jmi3);
		jm2 = new JMenu("编辑");
		jmi4 = new JMenuItem("复制");
		jmi5 = new JMenuItem("粘贴");
		jmi6 = new JMenuItem("剪切");
		jm2.add(jmi4); jm2.add(jmi5); jm2.add(jmi6);
		jm3 = new JMenu("帮助");
		jmi7 = new JMenuItem("帮助信息");
		jmi8 = new JMenuItem("版本信息");
		jm3.add(jmi7); jm3.add(jmi8);
		jmb.add(jm1); jmb.add(jm2); jmb.add(jm3);
		this.add(jmb,BorderLayout.NORTH);
		
		jta = new JTextArea();
		jsp = new JScrollPane(jta);
		this.add(jsp);
		jp = new JPanel();
		jtf = new JTextField(40);
		jb = new JButton("添加注释");
		jb.addActionListener(new MenuClick());
		jp.add(jtf); jp.add(jb);
		this.add(jp,BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	
	class MenuClick implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==jmi1) {
				root.setTitle("无标题 记事本");
				jta.setText("");
			} else if(e.getSource()==jmi2) {
				jta.setText("");
				JFileChooser jfc = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("txt & java & c", "txt", "java","c");
				jfc.setFileFilter(filter);
				int rel = jfc.showOpenDialog(root);
				if(rel==JFileChooser.APPROVE_OPTION) {
					File f = jfc.getSelectedFile();//获取打开的文件对象
					root.setTitle(f.getName()+" 记事本");
					openFile(f);
				}
			} else if(e.getSource()==jmi3) {
				JFileChooser jfc = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("txt & java & c", "txt", "java","c");
				jfc.setFileFilter(filter);
				int rel = jfc.showSaveDialog(root);
				if(rel==JFileChooser.APPROVE_OPTION) {
					File f = jfc.getSelectedFile();//获取要保存的文件
					root.setTitle(f.getName()+" 记事本");
					saveFile(f);
				}
			} else if(e.getSource()==jb) {
				System.out.println("添加注释");
				System.out.println(jta.getLineCount());
				System.out.println(jta.getColumns());
			}
		}
		
		private void saveFile(File f) {
			PrintWriter out = null;
			try {
				out = new PrintWriter(f);
				out.print(jta.getText());
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally {
				if(out!=null) out.close();
			}
		}

		private void openFile(File f) {
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(f));
				String str = null;
				while((str=br.readLine())!=null) {
					jta.append(str+"\n");
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(br!=null) br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
