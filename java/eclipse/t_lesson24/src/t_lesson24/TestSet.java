package t_lesson24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("s1");
		set.add("s2");
		set.add("s3");
		set.add("s1");
		//使用Iterator的方式来遍历Set
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String e = iter.next();
			System.out.println(e);
		}
	}
}
