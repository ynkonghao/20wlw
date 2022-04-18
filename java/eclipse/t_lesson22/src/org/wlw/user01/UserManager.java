package org.wlw.user01;

//CRUD Create Read Update Delete
public class UserManager {
	User[] users;
	int index;
	
	public UserManager(int maxSize) {
		users = new User[maxSize];
		index = 0;
	}
	
	public void add(int pos,User user) {
		//在某个位置添加用户!
	}
	
	public void add(User user) {
		//1、数组是否已经满了
		if(index>=users.length) {
			System.out.println("用户已满，不能再添加");
			return;
		}
		//2、判断用户是否存在，如果存在就不能添加，提示错误信息
		if(this.load(user.getUsername())!=null) {
			System.out.println("添加的用户已经存在!");
			return;
		}
		//3、添加用户
		users[index] = user;
		index++;
	}
	
	//根据用户名加载用户
	public User load(String username) {
		//1、循环遍历users
		for(int i=0;i<index;i++) {
			//2、获取数组中的每一个用户对象
			User tu = users[i];
			//3、只要用户对象不为空
			//4、判断传入的用户名是否等于对象的用户名
			if(username.equals(tu.getUsername())) {
				//5、如果相等意味着用户找到了，返回该用户
				return tu;
			}
		}
		//6、如果循环没有返回，意味着用户不存在，返回null
		return null;
	}
	
	public void list() {
		for(int i=0;i<index;i++) {
			User tu = users[i];
			System.out.println(tu);
		}
	}
}
