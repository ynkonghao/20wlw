package t_lesson16;

import org.konghao.wlw.Person;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "王小二";
		p.show();
		//在java中创建了一组非常常用的类，并且把这些类都放到了java.lang包里面，java的虚拟机会默认导入java.lang中的所有内容
		String str = "abc";
	}
}
