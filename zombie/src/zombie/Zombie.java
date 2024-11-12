package zombie;

import java.util.Random;

public class Zombie extends Unit {

	protected Zombie(int pos, int hp, int maxPower) {
		super(pos, hp, maxPower);
	}

	@Override
	protected void attack(Unit target) {

		int power = ZombieGame.ran.nextInt(getMaxPower())+1;
		if (target.getHp() - power < 0) {
			target.setHp(-target.getHp());
		} else {
			target.setHp(-power);
		}
	}

	

}
