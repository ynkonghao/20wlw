package org.wlw.user06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

//CRUD Create Read Update Delete
public class UserManager {
	List<User> users;
	public static final String PATH = "D:\\teach_source\\20_wlw\\java\\eclipse\\t_lesson29\\src\\user.sav";
	
	public UserManager() {
		//程序一启动就加载，如果第一次启动，此时没有sav文件，得到的值是null
		users = load();
		//如果users为null，意味着文件不存在，需要手动创建列表。
		if(users==null) {
			users = new ArrayList<User>();
		}
	}
	
	public List<User> load() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(PATH));
			return (List<User>)ois.readObject();
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois!=null) ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public void save() {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(PATH));
			oos.writeObject(users);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null) oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public User delete(String username) {
		User tu = load(username);
		if(tu==null) {
			throw new UserException("删除的用户不存在!");
		}
		users.remove(tu);
		return tu;
	}
	
	//更新
	public void update(User user) {
		//1、获取用户
		User tu = this.load(user.getUsername());
		if(tu==null) {
			throw new UserException("更新的用户不存在!");
		}
		//2、完成更新
		tu.setNickname(user.getNickname());
		tu.setPassword(user.getPassword());
	}
	
	//实现一个通用的添加方法，可以在任意合理的位置添加，包括最后
	public void add(int pos,User user) {
		//1、判断用户是否存在，如果存在就不能添加，提示错误信息
		if(this.load(user.getUsername())!=null) {
			throw new UserException("添加的用户已经存在!");
		}
		if(user.getPassword().length()<6) {
			throw new UserException("密码必须超过6位");
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
			throw new UserException("用户不存在！");
		}
		if(!password.equals(tu.getPassword())) {
			throw new UserException("用户密码不正确!");
		}
		return tu;
	}
}
