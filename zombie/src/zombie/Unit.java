package zombie;

abstract public class Unit {
	protected int pos;
	protected int hp;
	protected int maxPower;
	protected Unit(int pos, int hp, int maxPower){
		this.pos = pos;
		this.hp = hp;
		this.maxPower = maxPower;
	}
	public abstract void Attack(Unit unit);
}
