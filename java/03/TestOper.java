public class TestOper {
	public static void main(String[] args) {
		int a = 10;
		//不论执行a++还是++a，最终a的值都是a=a+1
		int z = ++a;//a = 11,z = 11
		int b = a--;//a = 10,b = 11
		int d = ++z;//z = 12,d = 12
		int f = z++;//z = 13, f = 12
		int g = --b;//b = 10, g = 10
		int c = --a;//a = 9,c = 9
		int e = g++;//g = 11,e = 10
		System.out.println(a+","+b+","+c+","+d+","+e+","+f+","+g+","+z);
		//逻辑运算符 & | !-->只能用boolean类型
		int a1 = 2;
		int b1 = 1;//10 01
		System.out.println(a1&b1);
		System.out.println(!true);

		int c1 = 10;
		//int z1 = c1++;
		int c2 = 20;
		//System.out.println(true&true);
		//&& || 表示短路操作，当前面的表达式能够得到整个表达式的值的时候，就会不执行后面的判断了
		System.out.println(c1++>10&&--c2<20);
		System.out.println(c1+","+c2);
	}
}