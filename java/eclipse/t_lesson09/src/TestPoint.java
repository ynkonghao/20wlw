
public class TestPoint {
	public static void main(String[] args) {
		System.out.println(getDistance(10, 20, 30, 40));
	}
	
	public static double getDistance(double x1,double y1,double x2,double y2) {
		double r = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
		return Math.sqrt(r);
	}
}
