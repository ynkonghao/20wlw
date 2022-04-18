package t_lesson25;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestStatusWord {
	public static void main(String[] args) {
		String str = "1231iurafhaskjfiuhzfknaskjdfhsalkdf";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		//1、遍历所有的字符
		for(int i=0;i<str.length();i++) {
//			System.out.println(str.charAt(i));
			//2、判断字符是否在map中存在，如果存在就根据key取出value，让vaule+1之后重新存储，如果不存在直接put该字符value为1
			char c = str.charAt(i);
			if(map.containsKey(c)) {
				int v = map.get(c);
				v+=1;
				map.put(c, v);
			} else {
				map.put(c, 1);
			}
		}
		//2、遍历map
		Set<Character> keys = map.keySet();
		for(char key:keys) {
			System.out.println(key+":"+map.get(key));
		}
	}
}