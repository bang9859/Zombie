package zombie;

public class Boss extends Zombie{
	private int shield;
	protected Boss(int pos, int hp, int maxPower,int shield) {
		super(pos, hp, maxPower);
		this.shield = shield;
	}

}
