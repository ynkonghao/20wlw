
public class GameTools {
	
	public static boolean checkRate(int rate) {
		int ran = (int)(100*Math.random());
		if(ran<rate) {
			return true;
		}
		return false;
	}
}
