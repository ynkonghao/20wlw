package t_lesson24;

import java.util.ArrayList;
import java.util.List;

public class TestInt {

	public static void main(String[] args) {
//		List<double> list = new ArrayList<double>();//double,int等基本数据类型无法在泛型中设置
		//此时如果希望列表中存储基本数据类型，需要使用封装类，封装类指的是将基本数据类型变成对象类型
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(22);
		list.add(33);
		for(int n:list) {
			System.out.println(n);
		}
	}

}
