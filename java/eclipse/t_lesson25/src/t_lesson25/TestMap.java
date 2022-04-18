package t_lesson25;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		//map存储的是键值对，key和value都可以是任意类型
		map.put("zhangsan", 26);//使用put方法可以添加一个键值对
		map.put("lisi", 33);
		map.put("wangwu", 28);
		//通过get(key)可以获取map的值
		System.out.println(map.get("wangwu"));
		map.put("lisi", 28);//key的值不能重复，如果重复put一个key相同的值，此时会完成修改
		System.out.println(map.get("lisi"));
//		map.remove("lisi");//移除一个元素
		System.out.println(map.containsKey("lisi"));//map是否包含有某个键
		System.out.println(map.containsValue(28));//map是否包含某个值
		//通过map.size可以获取map的长度
		System.out.println(map.size());
		Set<String> keys =  map.keySet();//会将map中所有的key存储在一个Set列表中
		for(String key:keys) {
			System.out.println(key+"---"+map.get(key));
		}
	}
}
