
public class GameStart {
	public static void main(String[] args) {
		Knight k = new Knight("塔拉夏",22,9,100,15);
		Monster m1 = new Monster("僵尸");
		m1.show();
		Monster m2 = new Monster("吸血鬼");
		m2.show();
		Monster m3 = new Monster("大树精");
		m3.show();
		Monster m4 = new Monster("黑山老妖");
		m4.show();
		Monster m5 = new Monster("虎鲸");
		m5.show();
		k.fight(m1);
		k.fight(m2);
		k.fight(m3);
		k.fight(m5);
		k.fight(m4);
		k.show();
		m4.show();
	}
}
