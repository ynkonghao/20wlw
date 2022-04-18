public class TestSeq{
	public static void main(String[] args) {
		//所有的代码都是从上向下顺序执行
		//有一个叫goto可以改变顺序，但是从来不用，因为它会无法很好来读代码
		int a = 10;
		System.out.println(a);
		a = 20;
	}
}