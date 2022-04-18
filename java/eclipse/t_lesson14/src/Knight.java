
public class Knight {
	String name;
	int life;
	int maxLife;
	int attack;
	int defense;
	int exp;
	int level;
	int aglie;//敏捷，用来控制躲闪
	boolean isLive;
	int levelExp;
	int critRate;//暴击率
	int critDamage;//暴击伤害
	
	public Knight(String name,int attack,int defense,int maxLife,int aglie) {
		this.name = name;
		this.attack = attack;
		this.defense = defense;
		this.maxLife = maxLife;
		this.aglie = aglie;
		this.life = this.maxLife;
		this.exp = 0;
		this.level = 1;
		this.isLive = true;
		this.levelExp = 0;
		this.critRate = 15;
		this.critDamage = 2;
	}
	
	public void show() {
		System.out.println("骑士["+name+"]---攻击力:"+this.attack+
				"---防御力:"+this.defense+"---生命:"+this.life+"---敏捷:"+this.aglie+
				"---经验值:"+this.exp+"---等级:"+this.level);
	}
	
//	public boolean checkDodge(int rate) {
//		int ran = (int)(100*Math.random());
//		if(ran<rate) {
//			return true;
//		}
//		return false;
//	}
	
	public void injured(int lostLife) {
		//1、判断是否受伤
//		GameTools gt = new GameTools();
		boolean isDodge = GameTools.checkRate(this.aglie);
		if(isDodge) {
			System.out.println(this.name+":小样！嘿嘿！你打不到我!");
		} else {
			//2、受伤
			System.out.println(this.name+":哇哇哇！居然被打了!");
			this.life-=lostLife;
			if(this.life<=0) {
				this.isLive = false;
				System.out.println(this.name+":啊啊啊！天妒英才！");
				System.out.println("[上帝]:大侠不要灰心！请重新来过");
			}
		}
		System.out.println("--------------------------------------");
	}
	
	public void fight(Monster m) {
		while(m.isLive&&this.isLive) {
			System.out.println(this.name+"挥舞着大刀砍向"+m.type);
			int lostLife = 0;
			if(GameTools.checkRate(critRate)) {
				lostLife = (this.attack-m.defense)*this.critDamage;//丢失的生命
				System.out.println(this.name+":天神赐予我神力["+lostLife+"]");
			} else {
				lostLife = this.attack-m.defense;//丢失的生命
			}
			//如果lostLife的值小于0.让lostLife=1
			if(lostLife<=0) {
				lostLife = 1;
			}
			//怪兽受伤需要接收两个参数，一个是受伤的值，另外一个是骑士的对象
			m.injured(lostLife,this);
			//判断骑士是否需要升级
			if(!m.isLive) {
				checkUpdate(m);
			}
		}	
	}
	
	public void checkUpdate(Monster m) {
		this.exp+=m.deadExp;
		int texp = (this.level-1)*20+100;
		if(this.exp>=(this.levelExp+texp)) {
			this.levelExp+=texp;
			upgrade();
		}
	}
	
	public void upgrade() {
		System.out.println(this.name+":当当当!我的力量变强了，怪物们小心了!");
		this.level+=1;
		this.maxLife+=10;
		this.life = this.maxLife;
		this.attack+=3;
		this.attack+=3;
		this.aglie+=2;
		System.out.println("--------------------------------------");
		this.show();
		System.out.println("--------------------------------------");
	}
	
}