package org.wlw.user02;

import java.util.ArrayList;
import java.util.List;

//CRUD Create Read Update Delete
public class UserManager {
	List<User> users;
	
	public UserManager() {
		users = new ArrayList<User>();
	}
	
	public User delete(String username) {
		User tu = load(username);
		if(tu==null) {
			System.out.println("删除的用户不存在!");
			return null;
		}
		users.remove(tu);
		return tu;
	}
	
	//更新
	public void update(User user) {
		//1、获取用户
		User tu = this.load(user.getUsername());
		if(tu==null) {
			System.out.println("更新的用户不存在!");
		}
		//2、完成更新
		tu.setNickname(user.getNickname());
		tu.setPassword(user.getPassword());
	}
	
	//实现一个通用的添加方法，可以在任意合理的位置添加，包括最后
	public void add(int pos,User user) {
		//1、判断用户是否存在，如果存在就不能添加，提示错误信息
		if(this.load(user.getUsername())!=null) {
			System.out.println("添加的用户已经存在!");
			return;
		}
		users.add(pos,user);
	}
	
	//add的默认方法是在最后添加
	public void add(User user) {
		add(users.size(),user);
	}
	
	public User load(String username) {
		for(User u:users) {
			if(u.getUsername().equals(username)) {
				return u;
			}
		}
		return null;
	}
	
	public void list() {
		for(User u:users) {
			System.out.println(u);
		}
	}
	
	public User login(String username,String password) {
		User tu = load(username);
		if(tu==null) {
			System.out.println("用户不存在！");
			return null;
		}
		if(!password.equals(tu.getPassword())) {
			System.out.println("用户密码不正确!");
			return null;
		}
		return tu;
	}
}
