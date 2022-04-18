public class TestCircle {
	//定义常量
	public static double PI = 3.14;

	public static void main(String[] args) {
		double r = 33.6;
		System.out.println(calArea(r));
		System.out.println(calPerimeter(r));
	}

	public static double calArea(double r) {
		double area = PI*r*r;
		return area;
	}

	public static double calPerimeter(double r) {
		return 2*PI*r;
	}
}