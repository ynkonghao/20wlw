public class TestVar {
	public static void main(String[] args) {
		//变量定义的三要素，(变量的类型 变量的名称 =  变量的初始值;)
		int a = 12;
		int b;//使用之前编译不会保存
		b = 12;
		System.out.println(a);//在使用变量的时候，该变量一定要有初始化的值
		//int b = 33;//在同一个作用域中不能重复定义(声明)变量
		//同一作用域表示在同一个花括号内
		//c = 33;//使用变量前必须先定义
	}
}

/*

f1() {
	int a = 120;
	if(true) {
		int a = 33;
	}
}

f2() {
	if() {
		int a = 33;
	}
	a=22;
}


*/