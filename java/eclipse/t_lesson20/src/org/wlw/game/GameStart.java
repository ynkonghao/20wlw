package org.wlw.game;

public class GameStart {
	public static void main(String[] args) {
		Player k = new Knight("塔拉夏");
		Player w = new Wizzard("卡拉");
		Enemy m1 = new Monster();
		Enemy g = new Ghost();
		m1.show();
		w.fight(m1);
		w.show();
		w.fight(g);
		w.show();
	}
}
