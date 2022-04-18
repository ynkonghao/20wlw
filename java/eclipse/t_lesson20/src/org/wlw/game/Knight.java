package org.wlw.game;

public class Knight extends Player{
	
	
	public Knight(String name) {
		super(name,22,9,100,15);
		this.critRate = 22;
		this.critDamage = 33;
	}
	
	public void show() {
		System.out.println("角色类型:骑士");
		super.show();
	}
	
	public void fightInfo(Enemy e) {
		System.out.println(this.name+"挥舞着神圣之剑砍向"+e.type);
	}
	

	public void upgrade() {
		System.out.println(this.name+":当当当!我的力量变强了，怪物们小心了!");
		this.level+=1;
		this.maxLife+=10;
		this.life = this.maxLife;
		this.attack+=3;
		this.aglie+=2;
		System.out.println("--------------------------------------");
		this.show();
		System.out.println("--------------------------------------");
	}
	
}