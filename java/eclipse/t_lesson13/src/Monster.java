
public class Monster {
	String type;
	int attack;
	int defense;
	int life;
	int deadExp;//死亡之后提供的经验
	boolean isLive;
	
	public Monster(String type) {
		this.type = type;
		this.isLive = true;
		if(type=="僵尸") {
			this.attack = 15;
			this.defense = 6;
			this.life = 25;
			this.deadExp = 28;
		} else if(type=="吸血鬼") {
			this.attack = 20;
			this.defense = 3;
			this.life = 20;
			this.deadExp = 26;
		} else if(type=="大树精") {
			this.attack = 10;
			this.defense = 10;
			this.life = 35;
			this.deadExp = 32;
		} else if(type=="黑山老妖") {
			this.attack = 22;
			this.defense = 15;
			this.life = 68;
			this.deadExp = 45;
		} else {
			this.attack = 5;
			this.defense = 5;
			this.life = 20;
			this.deadExp = 18;
		}
	}
	
	public void show() {
		System.out.println("["+this.type+"]---生命:"+this.life+
				"---攻击:"+this.attack+"---防御:"+this.defense+
				"---提供经验:"+this.deadExp);
	}
	
	public void fight(Knight k) {
		System.out.println(this.type+":哇哈哈哈!"+k.name+"接招");
		int lostLife = this.attack-k.defense;
		if(lostLife<=0) {
			lostLife = 1;
		}
		k.injured(lostLife);
	}
	
	public void injured(int lostLife,Knight k) {
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