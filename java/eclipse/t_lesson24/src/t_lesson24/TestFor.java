package t_lesson24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestFor {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a1");
		list.add("a2");
		list.add("a3");
		Set<String> set = new HashSet<String>();
		set.add("s1");
		set.add("s2");
		set.add("s3");
		//将list变成一个Iterator,每一个元素就是s
		for(String l:list) {
			System.out.println(l);
		}
		//还可以用在Set的变量
		for(String s:set) {
			System.out.println(s);
		}
		String[] strs = new String[] {"bb","dd","cc"};
		for(String str:strs) {
			System.out.println(str);
		}
	}
}
