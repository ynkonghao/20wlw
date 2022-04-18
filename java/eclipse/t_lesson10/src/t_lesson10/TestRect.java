package t_lesson10;

public class TestRect {
	public static void main(String[] args) {
		Rect r = new Rect();
		r.width = 100;
		r.height = 40;
		System.out.println(r.calArea());
		System.out.println(r.calPerimeter());
	}
}

class Rect {
	int width;
	int height;
	
	public int calArea() {
		return width*height;
	}
	
	public int calPerimeter() {
		return 2*(width+height);
	}
}
