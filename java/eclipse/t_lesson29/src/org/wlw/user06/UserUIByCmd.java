package org.wlw.user06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserUIByCmd {
	private UserManager um;
	public UserUIByCmd() {
		um = new UserManager();
	}
	
	public void add(BufferedReader br) throws IOException {
		System.out.println("请输入用户名:");
		String username = br.readLine();
		System.out.println("请输入密码:");
		String password = br.readLine();
		System.out.println("请输入昵称:");
		String nickname = br.readLine();
		User user = new User();
		user.setNickname(nickname);
		user.setPassword(password);
		user.setUsername(username);
		um.add(user);
		um.save();
		System.out.println("添加用户成功!");
	}
	
	public void delete(BufferedReader br) throws IOException {
		System.out.println("请输入删除的用户名：");
		String username = br.readLine();
		um.delete(username);
		um.save();
		System.out.println("删除用户成功!");
	}
	
	public void read(BufferedReader br) throws IOException {
		System.out.println("请输入要查询的用户名:");
		String username = br.readLine();
		User u = um.load(username);
		System.out.println(u);
	}
	
	public void update(BufferedReader br) throws IOException {
		System.out.println("请输入要更新的用户名:");
		String username = br.readLine();
		System.out.println("请输入要更新的昵称:");
		String nickname = br.readLine();
		System.out.println("请输入要更新的密码:");
		String password = br.readLine();
		User u = new User();
		u.setNickname(nickname);
		u.setPassword(password);
		u.setUsername(username);
		um.update(u);
		um.save();
		System.out.println("更新用户成功!");
	}
	
	public void list() {
		um.list();
	}
	
	public void login(BufferedReader br) throws IOException {
		System.out.println("请输入登录的用户名:");
		String username = br.readLine();
		System.out.println("请输入登录的密码:");
		String password = br.readLine();
		User u = um.login(username, password);
		System.out.println("欢迎"+u.getNickname()+"登录我们的系统!");
	}
	
	public void run() {
		showInfo();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String str = null;
			while((str=br.readLine())!=null) {
				try {
					if("q".equalsIgnoreCase(str)) {
						break;
					} else if("A".equalsIgnoreCase(str)) {
						add(br);
					} else if("D".equalsIgnoreCase(str)) {
						delete(br);
					} else if("R".equalsIgnoreCase(str)) {
						read(br);
					} else if("U".equalsIgnoreCase(str)) {
						update(br);
					} else if("F".equalsIgnoreCase(str)) {
						list();
					} else if("L".equalsIgnoreCase(str)) {
						login(br);
					} else {
						System.out.println("呃...!请选择正确的操作！");
					}
				} catch (UserException e) {
					System.out.println("呜呜呜！发现错误:"+e.getMessage());
				}
				showInfo();
			}
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
	
	public void showInfo() {
		System.out.println("请选择具体的操作:");
		System.out.println("A(add),D(delete),R(Read),U(Update),F(List),L:(Login),Q:(Quit)");
	}
}
