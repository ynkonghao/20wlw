package org.wlw.game;

public class Ghost extends Enemy {
	
	public Ghost() {
		this.type = "黑山老妖零鬼";
		this.attack = 22;
		this.defense = 15;
		this.life = 68;
		this.deadExp = 45;
		this.isLive  = true;
	}

	@Override
	public void fightInfo(Player p) {
		System.out.println(this.type+":虎虎"+p.name+"看我的无敌风火轮!");
	}

}
