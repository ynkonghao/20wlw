public class TestOper2 {
	public static void main(String[] args) {
		//> >= <= !=
		//  10<a<20 这是不对的 a>10&&a<20
		int a = 10;
		//判断a是否大于10，如果大于10，z的值就是10，否则z的值就是20
		int z = a>10?10:20;
		System.out.println(z+","+a);
		//运算符的优先级
		int c = (a++)-(z--);
	}
}