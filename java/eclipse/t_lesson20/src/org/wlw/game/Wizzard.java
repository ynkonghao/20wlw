package org.wlw.game;

public class Wizzard extends Player {

	public Wizzard(String name) {
		super(name,30,4,100,10);
		this.critRate = 40;
		this.critDamage = 35;
	}
	
	@Override
	public void fightInfo(Enemy e) {
		System.out.println(this.name+"拿着魔法扫帚杀向了"+e.type+",咻咻咻休!");
	}

	@Override
	public void upgrade() {
		System.out.println(this.name+":呼呼呼!我的力量变强了，怪物们等在下地狱吧!!");
		this.level+=1;
		this.maxLife+=10;
		this.life = this.maxLife;
		this.attack+=4;
		this.aglie+=1;
		System.out.println("--------------------------------------");
		this.show();
		System.out.println("--------------------------------------");
	}

}
