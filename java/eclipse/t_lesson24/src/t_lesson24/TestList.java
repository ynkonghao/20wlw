package t_lesson24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.add(2, "b1");
		list.remove("a3");
		list.add("a1");
//		System.out.println(list.get(0));
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
