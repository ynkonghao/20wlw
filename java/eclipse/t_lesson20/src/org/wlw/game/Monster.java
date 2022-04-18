package org.wlw.game;

public class Monster extends Enemy{
	public Monster() {
		this.type = "僵尸";
		this.isLive = true;
		this.attack = 15;
		this.defense = 6;
		this.life = 25;
		this.deadExp = 28;
		
	}
	
	public void show() {
		System.out.println("["+this.type+"]---生命:"+this.life+
				"---攻击:"+this.attack+"---防御:"+this.defense+
				"---提供经验:"+this.deadExp);
	}
	
	public void fightInfo(Player k) {
		System.out.println(this.type+":哇哈哈哈!"+k.name+"接招");
	}
	
	public void injured(int lostLife,Player k) {
		if(lostLife<=1) {
			System.out.println(type+":哈哈！你太菜啦！给我捞痒痒吗！");
		} else {
			System.out.println(type+":呃！居然敢打我!");
		}
		this.life-=lostLife;
		//判断是否死亡
		if(this.life<=0) {
			this.isLive = false;
			System.out.println(type+":哇！啊啊啊啊啊啊！");
			if(this.type=="黑山老妖") {
				System.out.println("[上帝]:英雄！干得不错！");
			}
			System.out.println("------------------------------");
		}
		if(this.isLive) {
			this.fight(k);
		}
	}
}