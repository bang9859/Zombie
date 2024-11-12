package zombie;

abstract public class Unit {
	private int pos;
	private int hp;
	private int maxPower;

	protected Unit(int pos, int hp, int maxPower) {
		this.pos = pos;
		this.hp = hp;
		this.maxPower = maxPower;
	}

	public int getPos() {
		return this.pos;
	}

	public void setPos(int move) {
		this.pos += move;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int power) {
		this.hp += power;
	}

	public int getMaxPower() {
		return this.maxPower;
	}
	
	public void setMaxPower(int addPower) {
		this.maxPower+=addPower; 
	}

	protected abstract void attack(Unit unit);
}
