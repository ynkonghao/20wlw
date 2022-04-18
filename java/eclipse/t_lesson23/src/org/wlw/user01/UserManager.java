package org.wlw.user01;

//CRUD Create Read Update Delete
public class UserManager {
	User[] users;
	int index;
	
	public UserManager(int maxSize) {
		users = new User[maxSize];
		index = 0;
	}
	
	public User delete(String username) {
		//1、根据用户名得到具体的位置
		int pos = loadPos(username);
		if(pos<0) {
			System.out.println("删除的用户不存在!");
			return null;
		}
		//2、获取要删除的对象
		User tu = users[pos];
		//3、移位
		for(int i=pos;i<index-1;i++) {
			users[i] = users[i+1];
		}
		//4、把最后一位设为空，并且让index--
		index--;
		//5、返回删除的对象
		return tu;
	}
	
	//更新
	public void update(User user) {
		//1、获取用户所在的位置
		int pos = loadPos(user.getUsername());
		if(pos<0) {
			System.out.println("更新的用户不存在!");
			return;
		}
		//2、完成更新
//		users[pos] = user;//更新一般都不直接替换，而是使用修改进行操作
		users[pos].setNickname(user.getNickname());
		users[pos].setPassword(user.getPassword());
	}
	
	//实现一个通用的添加方法，可以在任意合理的位置添加，包括最后
	public void add(int pos,User user) {
		//在某个位置添加用户!
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
		//3、判断位置是否正确，添加的pos应该小于等于index
		if(pos>index) {
			System.out.println("添加的位置不正确!");
			return;
		}
		//4、执行添加
		//4.1、移位
		for(int i=index;i>pos;i--) {
			users[i] = users[i-1];
		}
		//4.2、设置用户
		users[pos] = user;
		//4.3、添加index
		index++;
	}
	
	//add的默认方法是在最后添加
	public void add(User user) {
		add(index,user);
	}
	
	//根据用户名得到具体的位置
	public int loadPos(String username) {
		for(int i=0;i<index;i++) {
			User tu = users[i];
			if(username.equals(tu.getUsername())) {
				return i;
			}
		}
		return -1;
	}
	
	//根据用户名加载用户，使用loadPos方法
	public User load(String username) {
		int pos = loadPos(username);
		if(pos<0) {
			return null;
		}
		return users[pos];
	}
	
	public void list() {
		for(int i=0;i<index;i++) {
			User tu = users[i];
			System.out.println(tu);
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
