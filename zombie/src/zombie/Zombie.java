package zombie;

import java.util.Random;

public class Zombie extends Unit{

	protected Zombie(int pos, int hp, int maxPower) {
		super(pos, hp, maxPower);
	}

	@Override
	public void Attack() {
		
		int power = ZombieGame.ran.nextInt(getMaxPower());
		
	}

}
