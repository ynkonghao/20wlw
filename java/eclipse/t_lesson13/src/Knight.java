
public class Knight {
	String name;
	int life;
	int attack;
	int defense;
	int exp;
	int level;
	int aglie;//敏捷，用来控制躲闪
	boolean isLive;
	int levelExp;
	
	public Knight(String name,int attack,int defense,int life,int aglie) {
		this.name = name;
		this.attack = attack;
		this.defense = defense;
		this.life = life;
		this.aglie = aglie;
		this.exp = 0;
		this.level = 1;
		this.isLive = true;
		this.levelExp = 0;
	}
	
	public void show() {
		System.out.println("骑士["+name+"]---攻击力:"+this.attack+
				"---防御力:"+this.defense+"---生命:"+this.life+"---敏捷:"+this.aglie+
				"---经验值:"+this.exp+"---等级:"+this.level);
	}
	
	public boolean checkDodge(int rate) {
		int ran = (int)(100*Math.random());
		if(ran<rate) {
			return true;
		}
		return false;
	}
	
	public void injured(int lostLife) {
		//1、判断是否受伤
		boolean isDodge = this.checkDodge(this.aglie);
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
			int lostLife = this.attack-m.defense;//丢失的生命
			//如果lostLife的值小于0.让lostLife=1
			if(lostLife<=0) {
				lostLife = 1;
			}
			//怪兽受伤需要接收两个参数，一个是受伤的值，另外一个是骑士的对象
			m.injured(lostLife,this);
		}	
	}
	
	
}