public class TestRect {
	public static void main(String[] args) {
		double w = 30;
		double h = 23.5;
		System.out.println(calArea(w,h));
		System.out.println(calPerimeter(w,h));
	}

	public static double calArea(double w,double h) {
		double area = w*h;
		return area;
	}

	public static double calPerimeter(double w,double h) {
		return 2*(w+h);
	}
}