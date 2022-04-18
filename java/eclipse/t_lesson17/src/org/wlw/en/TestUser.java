package org.wlw.en;

public class TestUser {
	public static void main(String[] args) {
		User u = new User();
		u.setAge(33);
//		u.name = "张三";
		u.setName("张三");
		u.playGame();
		
		User u2 = new User();
		u2.setAge(12);
		u2.setName("李四");
		u2.playGame();
		
		User u3 = new User();
		u3.setAge(14);
		System.out.println(u3.getAge());
		u3.setName("赵柳");;
		u3.playGame();
	}
}
