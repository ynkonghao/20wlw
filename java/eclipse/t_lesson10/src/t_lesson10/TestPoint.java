package t_lesson10;

public class TestPoint {
	public static void main(String[] args) {
		Point p = new Point();
		p.x = 22;
		p.y = 33;
		Point p1 = new Point();
		p1.x = 44;
		p1.y = 55;
		System.out.println(p.getDistance(p1));
		
		Point p3 = new Point();
		p3.x = 12;
		p3.y = 33;
		p3.z = 44;
		
		Point p4 = new Point();
		p4.x = 99;
		p4.y = 22;
		p4.z = 67;
		
		System.out.println(p3.getDistance(p4));
	}
}

class Point {
	double x;
	double y;
	double z;
	
	public double getDistance(Point p) {
		double r = (p.x-x)*(p.x-x)+(p.y-y)*(p.y-y)+(p.z-z)*(p.z-z);
		return Math.sqrt(r);
	}
}
