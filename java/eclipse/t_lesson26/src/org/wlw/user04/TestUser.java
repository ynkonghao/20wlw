package org.wlw.user04;

public class TestUser {
	public static void main(String[] args) {
		UserManager um = new UserManager();
		try {
			um.add(new User("ldh","刘德华","112323"));
			um.add(new User("laozhang","老张","121231233"));
			um.add(new User("xtx","谢天笑","121231233"));
			um.add(2,new User("ldm","刘东明","312312333"));
			um.add(1,new User("ldh","令狐冲","312312333"));
			User u = um.delete("laozhang");
			System.out.println("delete:"+u);
			um.update(new User("ldm","刘二","112233"));
			User tu = um.login("ldh", "112323");
			if(tu!=null) {
				System.out.println("欢迎"+tu.getNickname()+"使用我的系统!");
			}
		} catch(UserException e) {
			System.out.println(e.getMessage());
		}
		um.list();
	}
}
