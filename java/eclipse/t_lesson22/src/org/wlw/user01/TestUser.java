package org.wlw.user01;

public class TestUser {
	public static void main(String[] args) {
		UserManager um = new UserManager(10);
		um.add(new User("ldh","刘德华","123"));
		um.add(new User("laozhang","老张","123"));
		um.add(new User("ldh","对对对","123"));
		um.list();
	}
}
