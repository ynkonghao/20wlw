package org.wlw.user03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//CRUD Create Read Update Delete
public class UserManager {
	Map<String,User> users;
	
	public UserManager() {
		users = new HashMap<String,User>();
	}
	
	public User delete(String username) {
		if(!users.containsKey(username)) {
			System.out.println("删除的用户不存在!");
			return null;
		} 
		User tu = users.get(username);
		users.remove(username);
		return tu;	
	}
	
	//更新
	public void update(User user) {
		if(!users.containsKey(user.getUsername())) {
			System.out.println("更新的用户不存在!");
			return;
		}
		//1、获取用户
		User tu = users.get(user.getUsername());
		//2、完成更新
		tu.setNickname(user.getNickname());
		tu.setPassword(user.getPassword());
	}
	
	//add的默认方法是在最后添加
	public void add(User user) {
		//1、判断用户是否存在
		if(users.containsKey(user.getUsername())) {
			System.out.println("要添加的用户已经存在!");
			return;
		}
		//2、添加用户
		users.put(user.getUsername(), user);
	}
	
	public User load(String username) {
		return users.get(username);
	}
	
	public void list() {
		Set<String> keys = users.keySet();
		for(String key:keys) {
			System.out.println(users.get(key));
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
