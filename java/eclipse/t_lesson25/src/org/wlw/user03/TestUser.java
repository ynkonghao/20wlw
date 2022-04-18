package org.wlw.user03;

public class TestUser {
	public static void main(String[] args) {
		UserManager um = new UserManager();
		um.add(new User("ldh","刘德华","123"));
		um.add(new User("laozhang","老张","123"));
		um.add(new User("xtx","谢天笑","123"));
		um.add(new User("ldm","刘东明","333"));
		um.add(new User("lhc","令狐冲","333"));
		User u = um.delete("laozhang");
		System.out.println("delete:"+u);
		um.update(new User("ldm","刘二","112233"));
		um.list();
		User tu = um.login("ldh", "123");
		if(tu!=null) {
			System.out.println("欢迎"+tu.getNickname()+"使用我的系统!");
		}
	}
}
